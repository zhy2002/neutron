package zhy2002.examples.register;

import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.register.rule.PasswordIsStrongRule;
import zhy2002.examples.register.rule.RepeatPasswordRule;
import zhy2002.neutron.*;
import zhy2002.neutron.rule.LengthValidationRule;
import zhy2002.neutron.rule.RangeValidationRule;
import zhy2002.neutron.rule.StringValueRequiredValidationRule;
import zhy2002.neutron.util.ClassUtil;

import java.math.BigDecimal;
import java.util.function.Predicate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * These tests run in both Send and Post mode.
 */
public class RegisterCommonSendTest {

    private RegisterNodeContext context;
    private RegisterNode registerNode;

    @Before
    public void setup() {
        context = createContext();
        registerNode = context.getRootNode();
    }

    protected RegisterNodeContext createContext() {
        ClassRegistryImpl factoryRegistry = new RegisterClassRegistry();
        return new RegisterNodeContext(factoryRegistry);
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

        //assert - no error in the beginning
        assertThat(errors.getItemCount(), equalTo(0));

        //act
        usernameNode.setValue("abc");

        //assert
        assertThat(errors.getItemCount(), equalTo(1));
        ErrorNode error = errors.getItem(0);
        assertThat(error.getSource(), sameInstance(usernameNode));
        assertThat(error.getRule(), instanceOf(LengthValidationRule.class));
        assertThat(error.getMessage(), equalTo(usernameNode.getLengthMessage()));

        //act
        usernameNode.setValue("test");

        //assert
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
            assertThat(ex.getMessage(), equalTo(usernameNode.getInvalidCharsMessage()));
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
        assertThat(emailNode.getTriggeredBy(), equalTo("DefaultEmailByUsernameRule"));

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
        assertThat(hasError(StringValueRequiredValidationRule.class), equalTo(false));

        receiveOffersNode.setValue(Boolean.TRUE);
        assertThat(emailNode.getRequired(), equalTo(true));
        assertThat(hasError(StringValueRequiredValidationRule.class), equalTo(true));

        receiveOffersNode.setValue(Boolean.FALSE);
        assertThat(emailNode.getRequired(), equalTo(false));
        assertThat(hasError(StringValueRequiredValidationRule.class), equalTo(false));

    }

    private boolean hasError(Class<? extends UiNodeRule<?>> clazz) {
        return hasError(node -> ClassUtil.isInstanceOf(clazz, node.getRule()));
    }

    private boolean hasError(Predicate<ErrorNode> predicate) {
        for (int i = 0; i < registerNode.getErrorListNode().getItemCount(); i++) {
            ErrorNode errorNode = registerNode.getErrorListNode().getItem(i);
            if (predicate.test(errorNode))
                return true;
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

        assertThat(hasError(StringValueRequiredValidationRule.class), equalTo(true));
        ErrorNode errorNode = errorListNode.getItem(0);
        assertThat(errorNode.getMessage(), equalTo(PasswordIsStrongRule.WEAK_PASSWORD));

        UsernameNode usernameNode = registerNode.getUsernameNode();
        usernameNode.setValue("hello");

        assertThat(
                hasError(node -> node.getRule() instanceof StringValueRequiredValidationRule && node.getSource() == usernameNode),
                equalTo(false)
        );

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

        assertThat(hasError(StringValueRequiredValidationRule.class), equalTo(false));

        emailNode.setValue("");
        assertThat(hasError(StringValueRequiredValidationRule.class), equalTo(true));

        emailNode.setValue("a@a");
        assertThat(hasError(StringValueRequiredValidationRule.class), equalTo(false));

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

        assertThat(hasError(RangeValidationRule.class), equalTo(false));

        registerNode.refresh();
        assertThat(hasError(RangeValidationRule.class), equalTo(false));

        AgeNode ageNode = registerNode.getAgeNode();
        ageNode.setText("abc");
        assertThat(ageNode.getValue(), nullValue());
        assertThat(hasError(RangeValidationRule.class), equalTo(false));

        ageNode.setValue(new BigDecimal("12"));
        assertThat(hasError(RangeValidationRule.class), equalTo(false));

        ageNode.setText("13");
        assertThat(hasError(RangeValidationRule.class), equalTo(false));

        ageNode.setText("1000");
        assertThat(hasError(RangeValidationRule.class), equalTo(true));

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
        typeInValidData("hello", "AaBb123");

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


    @Test
    public void requiredIsSetInPhoneInfoFields() {
        PhoneInfoNode phoneInfoNode = registerNode.getHomePhoneNode();

        assertThat(phoneInfoNode.getCountryCodeNode().getRequired(), equalTo(false));
        assertThat(phoneInfoNode.getAreaCodeNode().getRequired(), equalTo(false));
        assertThat(phoneInfoNode.getPhoneNumberNode().getRequired(), equalTo(false));

        phoneInfoNode.getCountryCodeNode().setValue("+86");

        assertThat(phoneInfoNode.getCountryCodeNode().getRequired(), equalTo(true));
        assertThat(phoneInfoNode.getAreaCodeNode().getRequired(), equalTo(true));
        assertThat(phoneInfoNode.getPhoneNumberNode().getRequired(), equalTo(true));

        phoneInfoNode.getCountryCodeNode().setValue("");

        assertThat(phoneInfoNode.getCountryCodeNode().getRequired(), equalTo(false));
        assertThat(phoneInfoNode.getAreaCodeNode().getRequired(), equalTo(false));
        assertThat(phoneInfoNode.getPhoneNumberNode().getRequired(), equalTo(false));
    }

    @Test
    public void canValidateRequiredPhoneField() {
        typeInValidData("test", "aAaA12");
        registerNode.refresh();
        assertThat(registerNode.getErrorListNode().getItemCount(), equalTo(0));

        registerNode.getHomePhoneNode().getAreaCodeNode().setValue("02");
        assertThat(registerNode.getErrorListNode().getItemCount(), equalTo(2));

        registerNode.getHomePhoneNode().getCountryCodeNode().setValue("+61");
        assertThat(registerNode.getErrorListNode().getItemCount(), equalTo(1));

        registerNode.getHomePhoneNode().getPhoneNumberNode().setValue("11112222");
        assertThat(registerNode.getErrorListNode().getItemCount(), equalTo(0));

        registerNode.getHomePhoneNode().getAreaCodeNode().setValue("");
        assertThat(registerNode.getErrorListNode().getItemCount(), equalTo(1));
    }

    private void typeInValidData(String test, String aAaA12) {
        registerNode.getUsernameNode().setValue(test);
        registerNode.getPasswordNode().setValue(aAaA12);
        registerNode.getRepeatPasswordNode().setValue(aAaA12);
        registerNode.getResidentialPropertyNode().getPropertyStateNode().setValue("NSW");
    }

    @Test
    public void canFirePatternEvents() {
        typeInValidData("test", "aAaA12");
        assertThat(registerNode.getErrorListNode().getItemCount(), equalTo(0));
        EmailNode emailNode = registerNode.getEmailNode();
        emailNode.setValue("123");
        assertThat(registerNode.getErrorListNode().getItemCount(), equalTo(1));
        emailNode.setValue("123@123.com");
        assertThat(registerNode.getErrorListNode().getItemCount(), equalTo(0));
    }

    @Test
    public void canUpdateProductPlansBasedOnAge() {
        typeInValidData("test", "aAaA12");

        PlanNode planNode = registerNode.getPlanNode();
        AgeNode ageNode = registerNode.getAgeNode();

        planNode.setValue("A");
        ageNode.setValue(new BigDecimal("11"));

        assertThat(planNode.getValue(), equalTo("A"));

        ageNode.setValue(new BigDecimal("18"));

        assertThat(planNode.getValue(), equalTo(""));

        planNode.setValue("C");
        assertThat(planNode.getValue(), equalTo("C"));

        ageNode.setText("1999");

        assertThat(planNode.getValue(), equalTo(""));

    }
}