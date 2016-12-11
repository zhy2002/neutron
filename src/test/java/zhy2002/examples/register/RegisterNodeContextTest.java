package zhy2002.examples.register;

import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.register.rule.*;
import zhy2002.neutron.*;
import zhy2002.neutron.util.ClassUtil;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class RegisterNodeContextTest {

    private RegisterNodeContextAbstract context;
    private RegisterNode registerNode;

    @Before
    public void setup() {
        ClassRegistryImpl factoryRegistry = new RegisterClassRegistry();
        context = new RegisterNodeContextAbstract(factoryRegistry);
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
        assertThat(errors.getItemCount(), equalTo(0));

        //act
        usernameNode.setValue("abc");

        //assert
        assertThat(errors.getItemCount(), equalTo(1));
        ErrorNode error = errors.getItem(0);
        assertThat(error.getSource(), sameInstance(usernameNode));
        assertThat(error.getMessage(), equalTo(UsernameLengthRule.ERROR_MESSAGE));

        usernameNode.setValue("test");
        assertThat(errors.getItemCount(), equalTo(0));
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
        assertThat(registerNode.getErrorListNode().getItemCount(), equalTo(0));
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

        assertThat(registerNode.getErrorListNode().getItemCount(), equalTo(1));

        usernameNode.setValue("abcd");
        assertThat(registerNode.getErrorListNode().getItemCount(), equalTo(0));
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

        assertThat(registerNode.getErrorListNode().getItemCount(), equalTo(0));
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
        assertThat(hasError(ValidateEmailIsRequiredRule.class), equalTo(true));

        receiveOffersNode.setValue(Boolean.FALSE);
        assertThat(emailNode.getRequired(), equalTo(false));

    }

    private boolean hasError(Class<? extends UiNodeRule<?, ?>> ruleClass) {
        for (int i = 0; i < registerNode.getErrorListNode().getItemCount(); i++) {
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
        assertThat(errorListNode.getItemCount(), equalTo(0));

        registerNode.refresh();

        assertThat(hasError(UsernameIsRequiredRule.class), equalTo(true));
        ErrorNode errorNode = errorListNode.getItem(0);
        assertThat(errorNode.getMessage(), equalTo(UsernameIsRequiredRule.ERROR_MESSAGE));

        UsernameNode usernameNode = registerNode.getUsernameNode();
        usernameNode.setValue("hello");

        assertThat(hasError(UsernameIsRequiredRule.class), equalTo(false));

    }

    @Test
    public void canClearRepeatPasswordError() {

        UsernameNode usernameNode = registerNode.getUsernameNode();
        usernameNode.setValue("test");
        PasswordNode passwordNode = registerNode.getPasswordNode();
        passwordNode.setValue("Aa1234");

        assertThat(hasError(RepeatPasswordRule.class), equalTo(true));

        RepeatPasswordNode repeatPasswordNode = registerNode.getRepeatPasswordNode();
        repeatPasswordNode.setValue("Aa1234");

        assertThat(hasError(RepeatPasswordRule.class), equalTo(false));
    }

    @Test
    public void shouldClearPhaseWhenRollback() {

        UsernameNode usernameNode = registerNode.getUsernameNode();
        usernameNode.setValue("test1");
        assertThat(context.getCurrentPhase(), nullValue());

        boolean thrown = false;
        try {
            usernameNode.setValue("test#");
        } catch (RuntimeException ex) {
            thrown = true;
        }
        assertThat(thrown, equalTo(true));

        context.rollbackSession();
        assertThat(context.getCurrentPhase(), nullValue());
        assertThat(usernameNode.getValue(), equalTo("test1"));

        usernameNode.setValue("test11");
        assertThat(usernameNode.getValue(), equalTo("test11"));
    }

    @Test
    public void emailIsRequiredIfCleared() {

        EmailNode emailNode = registerNode.getEmailNode();
        emailNode.setValue("test@gmail.com");
        ReceiveOffersNode receiveOffersNode = registerNode.getReceiveOffersNode();
        receiveOffersNode.setValue(Boolean.TRUE);

        assertThat(hasError(ValidateEmailIsRequiredRule.class), equalTo(false));

        emailNode.setValue("");
        assertThat(hasError(ValidateEmailIsRequiredRule.class), equalTo(true));

        emailNode.setValue("a");
        assertThat(hasError(ValidateEmailIsRequiredRule.class), equalTo(false));

    }

    @Test
    public void numberNodeCanSyncBetweenTextAndValue() {

        AgeNode ageNode = registerNode.getAgeNode();
        ageNode.setText("12");
        BigDecimal value = ageNode.getValue();

        assertThat(value, equalTo(new BigDecimal("12")));

        ageNode.setValue(new BigDecimal("98"));
        assertThat(ageNode.getText(), equalTo("98"));

        ageNode.setText("12a");
        assertThat(ageNode.getText(), equalTo("12a"));
    }

    @Test
    public void canSetNumberValueToNull() {
        AgeNode ageNode = registerNode.getAgeNode();

        ageNode.setText("34");
        assertThat(ageNode.getValue(), equalTo(new BigDecimal("34")));

        ageNode.setValue(null);
        assertThat(ageNode.getValue(), nullValue());
        assertThat(ageNode.getText(), equalTo(""));
    }

    @Test
    public void canSetAgeErrorCorrectly() {

        assertThat(hasError(AgeValidRule.class), equalTo(false));

        registerNode.refresh();
        assertThat(hasError(AgeValidRule.class), equalTo(false));

        AgeNode ageNode = registerNode.getAgeNode();
        ageNode.setText("abc");
        assertThat(hasError(AgeValidRule.class), equalTo(true));

        ageNode.setValue(new BigDecimal("12"));
        assertThat(hasError(AgeValidRule.class), equalTo(false));

        ageNode.setText("13");
        assertThat(hasError(AgeValidRule.class), equalTo(false));

    }

    @Test
    public void canLoadInvestmentPropertyNodeManually() {
        PropertyDetailsNode investmentProperty = registerNode.getInvestmentPropertyNode();
        assertThat(investmentProperty.getNodeStatus(), equalTo(NodeStatusEnum.Unloaded));

        investmentProperty.load();
        assertThat(investmentProperty.getNodeStatus(), equalTo(NodeStatusEnum.Loaded));

        investmentProperty.load(); //will not cause error
        investmentProperty.unload();
        assertThat(investmentProperty.getNodeStatus(), equalTo(NodeStatusEnum.Unloaded));
    }

    @Test
    public void canLoadAndUnloadInvestmentPropertyNodeWhenOwnInvestmentPropertyValueChanges() {
        OwnInvestmentPropertyNode ownInvestmentPropertyNode = registerNode.getOwnInvestmentPropertyNode();
        ownInvestmentPropertyNode.setValue(Boolean.TRUE);
        PropertyDetailsNode investmentPropertyNode = registerNode.getInvestmentPropertyNode();
        assertThat(investmentPropertyNode.getNodeStatus(), equalTo(NodeStatusEnum.Loaded));

        investmentPropertyNode.setTooltip("test1");
        assertThat(investmentPropertyNode.getTooltip(), equalTo("test1"));

        ownInvestmentPropertyNode.setValue(Boolean.FALSE);
        investmentPropertyNode = registerNode.getInvestmentPropertyNode();
        assertThat(investmentPropertyNode.getNodeStatus(), equalTo(NodeStatusEnum.Unloaded));

        assertThat(investmentPropertyNode.getTooltip(), nullValue());
        assertThat(investmentPropertyNode.getLoadWithParent(), equalTo(false));
    }

    @Test
    public void requiredValidationDoesNotHappenIfParentNodeIsUnloaded() {
        registerNode.getUsernameNode().setValue("hello");
        registerNode.getPasswordNode().setValue("AaBb123");
        registerNode.getRepeatPasswordNode().setValue("AaBb123");
        registerNode.getResidentialPropertyNode().getPropertyStateNode().setValue("NSW");

        registerNode.refresh();
        assertThat(registerNode.getErrorListNode().getItemCount(), equalTo(0));

        registerNode.getOwnInvestmentPropertyNode().setValue(Boolean.TRUE);
        registerNode.refresh();
        assertThat(registerNode.getErrorListNode().getItemCount(), equalTo(1));

    }

    @Test
    public void canReceiveNotificationWhenNodeLoadOrUnload() {
        CountingChangeListener listener = new CountingChangeListener();
        PropertyDetailsNode node = registerNode.getInvestmentPropertyNode();
        node.addChangeListener(listener);
        OwnInvestmentPropertyNode ownInvestmentPropertyNode = registerNode.getOwnInvestmentPropertyNode();
        ownInvestmentPropertyNode.setValue(Boolean.TRUE);

        assertThat(listener.getCount(), equalTo(1));

        ownInvestmentPropertyNode.setValue(Boolean.TRUE);
        assertThat(listener.getCount(), equalTo(1));

        ownInvestmentPropertyNode.setValue(Boolean.parseBoolean("true"));
        assertThat(listener.getCount(), equalTo(1));

        ownInvestmentPropertyNode.setValue(false);
        assertThat(listener.getCount(), equalTo(2));
    }

    @Test
    public void canProcessEventsInBatch() {
        UsernameNode usernameNode = registerNode.getUsernameNode();
        AgeNode ageNode = registerNode.getAgeNode();
        EmailNode emailNode = registerNode.getEmailNode();

        context.beginSession();
        context.setCycleMode(CycleModeEnum.Batched);

        usernameNode.setValue("test1");
        ageNode.setText("32");

        assertThat(usernameNode.getValue(), equalTo(""));
        assertThat(ageNode.getValue(), nullValue());

        context.flush();

        assertThat(usernameNode.getValue(), equalTo("test1"));
        assertThat(ageNode.getValue(), equalTo(new BigDecimal("32")));
        assertThat(emailNode.getValue(), equalTo("test1@gmail.com"));

        registerNode.getUsernameNode().setValue("test2");
        emailNode.setValue("test2x@gmail.com");

        context.flush();

        assertThat(usernameNode.getValue(), equalTo("test2"));
        assertThat(ageNode.getValue(), equalTo(new BigDecimal("32")));
        assertThat(emailNode.getValue(), equalTo("test2@gmail.com"));

        context.undo();

        assertThat(usernameNode.getValue(), equalTo("test1"));
        assertThat(ageNode.getValue(), equalTo(new BigDecimal("32")));
        assertThat(emailNode.getValue(), equalTo("test1@gmail.com"));

        assertThat(context.canRedo(), equalTo(true));

        emailNode.setValue("test2x@gmail.com");

        assertThat(context.canRedo(), equalTo(false)); //cannot redo after change

        context.rollbackSession();
    }

}