package zhy2002.examples.register;

import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.register.rule.PasswordIsStrongRule;
import zhy2002.examples.register.rule.UsernameIsRequiredRule;
import zhy2002.examples.register.rule.UsernameLengthRule;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.rule.UiNodeRule;
import zhy2002.neutron.util.ClassUtil;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class RegisterNodeContextTest {

    private RegisterNodeContext context;
    private RegisterNode registerNode;

    @Before
    public void setup() {
        ClassRegistryImpl factoryRegistry = new RegisterClassRegistry();
        context = new RegisterNodeContext(factoryRegistry);
        registerNode = context.getRootNode();
    }

    @Test
    public void canCreateRegisterNodeContext() {
        //act
        RegisterNode registerNode = context.getRootNode();

        //assert
        assertThat(registerNode, notNullValue());
        assertThat(registerNode.getUsernameNode(), notNullValue());
        assertThat(registerNode.getPasswordNode(), notNullValue());
        assertThat(registerNode.getErrorListNode(), notNullValue());
    }

    @Test
    public void canSetUsernameNode() {
        UsernameNode usernameNode = registerNode.getUsernameNode();
        usernameNode.setValue("abc");

        assertThat(usernameNode.getValue(), equalTo("abc"));
    }

    @Test
    public void canSetPasswordNode() {
        PasswordNode passwordNode = registerNode.getPasswordNode();
        passwordNode.setValue("abc");

        assertThat(passwordNode.getValue(), equalTo("abc"));
    }

    @Test
    public void validateUsernameLength() {

        //arrange
        UsernameNode usernameNode = registerNode.getUsernameNode();
        ErrorListNode errors = registerNode.getErrorListNode();

        //assert
        assertThat(errors.getChildCount(), equalTo(0));

        //act
        usernameNode.setValue("abc");

        //assert
        assertThat(errors.getChildCount(), equalTo(1));
        ErrorNode error = errors.getItem(0);
        assertThat(error.getSource(), sameInstance(usernameNode));
        assertThat(error.getMessage(), equalTo(UsernameLengthRule.ERROR_MESSAGE));

        usernameNode.setValue("test");
        assertThat(errors.getChildCount(), equalTo(0));
    }

    @Test
    public void cannotTypeHashInUsername() {
        UsernameNode usernameNode = registerNode.getUsernameNode();
        usernameNode.setValue("test");
        assertThat(usernameNode.getValue(), equalTo("test"));

        boolean exceptionThrown = false;
        try {
            usernameNode.setValue("test#");
        } catch (RuntimeException ex) {
            exceptionThrown = true;
        }

        assertThat(exceptionThrown, equalTo(true));
        assertThat(usernameNode.getValue(), equalTo("test"));
    }

    @Test
    public void canRollback() {
        UsernameNode usernameNode = registerNode.getUsernameNode();
        usernameNode.setValue("Hello");
        context.beginSession();
        usernameNode.setValue("abc");
        context.rollbackSession();
        assertThat(usernameNode.getValue(), equalTo("Hello"));
        assertThat(registerNode.getErrorListNode().getChildCount(), equalTo(0));
    }

    @Test
    public void canUndoRedoStateChange() {
        UsernameNode usernameNode = registerNode.getUsernameNode();
        context.beginSession();
        usernameNode.setValue("test");
        assertThat(usernameNode.getValue(), equalTo("test"));

        usernameNode.setValue("test1");
        assertThat(usernameNode.getValue(), equalTo("test1"));

        assertThat(context.undo(), equalTo(true));
        assertThat(usernameNode.getValue(), equalTo("test"));

        assertThat(context.redo(), equalTo(true));
        assertThat(usernameNode.getValue(), equalTo("test1"));

        context.commitSession();
        assertThat(usernameNode.getValue(), equalTo("test1"));
    }

    @Test
    public void canCascadeChange() {
        UsernameNode usernameNode = registerNode.getUsernameNode();
        usernameNode.setValue("tes");
        assertThat(registerNode.getHasError(), equalTo(true));

        usernameNode.setValue("test");
        assertThat(registerNode.getHasError(), equalTo(false));
    }

    @Test
    public void shouldNotProduceDuplicateErrors() {
        UsernameNode usernameNode = registerNode.getUsernameNode();
        usernameNode.setValue("a");
        usernameNode.setValue("ab");
        usernameNode.setValue("abc");

        assertThat(registerNode.getErrorListNode().getChildCount(), equalTo(1));

        usernameNode.setValue("abcd");
        assertThat(registerNode.getErrorListNode().getChildCount(), equalTo(0));
    }

    @Test
    public void shouldChangeEmailWhenUsernameChanges() {
        UsernameNode usernameNode = registerNode.getUsernameNode();
        EmailNode emailNode = registerNode.getEmailNode();

        assertThat(usernameNode.getValue(), equalTo(""));
        assertThat(emailNode.getValue(), equalTo(""));

        usernameNode.setValue("test");
        assertThat(emailNode.getValue(), equalTo("test@gmail.com"));
    }

    @Test
    public void canGetCauseOfEvent() {
        UsernameNode usernameNode = registerNode.getUsernameNode();
        EmailNode emailNode = registerNode.getEmailNode();

        usernameNode.setValue("test");
        assertThat(emailNode.getValue(), equalTo("test@gmail.com"));
        assertThat(emailNode.getTriggeredBy(), equalTo("DefaultEmailByUsernameRuleImpl"));

        emailNode.setValue("my@gmail.com");
        assertThat(emailNode.getTriggeredBy(), equalTo("user direct"));
    }

    private static class CountingChangeListener implements UiNodeChangeListener {
        private int count = 0;

        @Override
        public void onUiNodeChanged() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    @Test
    public void shouldCallChangeNotification() {
        CountingChangeListener listener = new CountingChangeListener();
        EmailNode emailNode = registerNode.getEmailNode();
        emailNode.addChangeListener(listener);
        emailNode.setValue("test1@gmail.com");

        assertThat(listener.getCount(), equalTo(1));

        UsernameNode usernameNode = registerNode.getUsernameNode();
        usernameNode.setValue("test2");
        assertThat(listener.getCount(), equalTo(2));

        listener = new CountingChangeListener();
        ErrorListNode errorListNode = registerNode.getErrorListNode();
        errorListNode.addChangeListener(listener);
        usernameNode.setValue("abc");

        assertThat(listener.getCount(), equalTo(1));
    }

    @Test
    public void shouldIndirectlyChangedNodeGetNotification() {
        CountingChangeListener listener = new CountingChangeListener();
        registerNode.addChangeListener(listener);
        registerNode.refresh();
        assertThat(listener.getCount(), equalTo(1));
    }

    @Test
    public void passwordShouldBeStrong() {

        assertThat(registerNode.getErrorListNode().getChildCount(), equalTo(0));
        registerNode.refresh();

        assertThat(hasError(PasswordIsStrongRule.class), equalTo(true));

        registerNode.getPasswordNode().setValue("aA1234");
        assertThat(hasError(PasswordIsStrongRule.class), equalTo(false));

        registerNode.getPasswordNode().setValue("AA1234");
        assertThat(hasError(PasswordIsStrongRule.class), equalTo(true));

    }

    @Test
    public void shouldSetRequiredFlagWhenReceivingOffers() {

        ReceiveOffersNode receiveOffersNode = registerNode.getReceiveOffersNode();
        EmailNode emailNode = registerNode.getEmailNode();

        assertThat(emailNode.getRequired(), equalTo(false));

        receiveOffersNode.setValue(Boolean.TRUE);
        assertThat(emailNode.getRequired(), equalTo(true));

        receiveOffersNode.setValue(Boolean.FALSE);
        assertThat(emailNode.getRequired(), equalTo(false));

    }

    private boolean hasError(Class<? extends UiNodeRule<?, ?>> ruleClass) {
        for (int i = 0; i < registerNode.getErrorListNode().getChildCount(); i++) {
            ErrorNode errorNode = registerNode.getErrorListNode().getItem(i);
            if (ClassUtil.isInstanceOf(ruleClass, errorNode.getRule())) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void emailDefaultValueShouldBeEmpty() {
        EmailNode emailNode = registerNode.getEmailNode();

        assertThat(emailNode.getValue(), equalTo(""));
    }

    @Test
    public void shouldValidateRequiredFieldWhenRefresh() {

        ErrorListNode errorListNode = registerNode.getErrorListNode();
        assertThat(errorListNode.getChildCount(), equalTo(0));

        registerNode.refresh();

        assertThat(errorListNode.getChildCount(), equalTo(1));
        ErrorNode errorNode = errorListNode.getItem(0);
        assertThat(errorNode.getMessage(), equalTo(UsernameIsRequiredRule.ERROR_MESSAGE));

        UsernameNode usernameNode = registerNode.getUsernameNode();
        usernameNode.setValue("hello");
        //registerNode.refresh();
        assertThat(errorListNode.getChildCount(), equalTo(0));

    }


}