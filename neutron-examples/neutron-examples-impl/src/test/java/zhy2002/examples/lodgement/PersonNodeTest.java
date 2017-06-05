package zhy2002.examples.lodgement;

import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.TestUtil;
import zhy2002.examples.interop.JavaMethods;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.node.AddressRefListNodeImpl;
import zhy2002.neutron.CycleModeEnum;
import zhy2002.neutron.NodeStatusEnum;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.UiNodeContext;
import zhy2002.neutron.exception.UiNodeEventException;
import zhy2002.neutron.rule.BooleanFixedValueValidationRule;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static zhy2002.examples.TestUtil.BANK_B;

public class PersonNodeTest {

    private UiNodeContext<?> context;
    private ApplicationNode applicationNode;
    private PersonNode personNode;
    private PersonContactNode personContactNode;
    private PersonGeneralNode personGeneralNode;

    @Before
    public void setup() {
        applicationNode = JavaMethods.createApplicationNode(BANK_B, null);
        context = applicationNode.getContext();
        PersonListNode personListNode = applicationNode.getPersonListNode();
        personNode = personListNode.createItem();
        personContactNode = personNode.getPersonContactNode();
        personGeneralNode = personNode.getPersonGeneralNode();
    }

    @Test
    public void addressRefListIsUpdatedWhenAnAddressNodeIsAdded() {
        applicationNode.getSubmissionNode().unloadDirectly();

        AddressRefListNode addressRefListNode = applicationNode.getAddressRefListNode();
        assertThat(addressRefListNode.getItemCount(), equalTo(5));

        personNode.getParent().removeByIndex(0);
        assertThat(addressRefListNode.getItemCount(), equalTo(1)); //first one is automatically added

        personNode.getParent().createItem();
        personNode.getParent().createItem();
        assertThat(addressRefListNode.getItemCount(), equalTo(9));
    }

    @Test
    public void addressRefListShouldReportNonEmptyNonDuplicateAddresses() {
        AddressRefListNodeImpl AddressRefListNode = (AddressRefListNodeImpl) applicationNode.getAddressRefListNode();
        assertThat(AddressRefListNode.getUniqueAddressNodes().length, equalTo(0));

        personContactNode.getCurrentAddressNode().getAddressLineNode().setValue("1 John St.");
        assertThat(AddressRefListNode.getUniqueAddressNodes().length, equalTo(1));

        personContactNode.getPostalAddressNode().getPostcodeNode().setValue("2500");
        assertThat(AddressRefListNode.getUniqueAddressNodes().length, equalTo(2));
    }

    @Test
    public void creditHistoryListIsEnabledByLegalActionEqYes() {
        PersonPrivacyNode privacyNode = personNode.getPersonPrivacyNode();
        CreditHistoryListNode creditHistoryListNode = privacyNode.getCreditHistoryListNode();
        assertThat(creditHistoryListNode.isDisabled(), equalTo(true));

        LegalActionNode legalActionNode = privacyNode.getLegalActionNode();
        legalActionNode.setValue("Yes");
        assertThat(creditHistoryListNode.isDisabled(), equalTo(false));

        creditHistoryListNode.createItem();
        legalActionNode.setValue("No");
        assertThat(creditHistoryListNode.isDisabled(), equalTo(true));
        assertThat(creditHistoryListNode.getItemCount(), equalTo(0));
    }

    @Test
    public void employmentEndedNodeIsNotLoadedForCurrentEmployment() {
        CurrentEmploymentNode currentEmploymentNode = personNode.getCurrentEmploymentListNode().createItem();
        assertThat(currentEmploymentNode.getPayeEmployedNode().getEmploymentEndedNode().getNodeStatus(), equalTo(NodeStatusEnum.Unloaded));

        PreviousEmploymentNode previousEmploymentNode = personNode.getPreviousEmploymentListNode().createItem();
        assertThat(previousEmploymentNode.getSelfEmployedNode().getEmploymentEndedNode().getNodeStatus(), equalTo(NodeStatusEnum.Loaded));
    }

    @Test
    public void canDistributePercentage() {

        SavingsAccountNode savingsAccountNode = applicationNode.getFinancialPositionNode().getAssetsNode().getSavingsAccountListNode().createItem();
        SavingsOwnershipListNode ownershipListNode = savingsAccountNode.getOwnershipListNode();

        assertThat(ownershipListNode.getItemCount(), equalTo(1));

        OwnershipNode ownershipNode = ownershipListNode.getItem(0);
        ownershipNode.getAverageFlagNode().setValue(Boolean.TRUE);

        assertThat(ownershipNode.getOwnershipPercentageNode().getValue(), equalTo(new BigDecimal("100")));
        assertThat(ownershipListNode.getTotalOwnership(), equalTo(new BigDecimal("100")));

        ownershipNode.getAverageFlagNode().setValue(Boolean.FALSE);
        assertThat(ownershipNode.getOwnershipPercentageNode().getValue(), equalTo(new BigDecimal("100")));
        assertThat(ownershipListNode.getTotalOwnership(), equalTo(new BigDecimal("100")));

        applicationNode.getPersonListNode().createItem();
        assertThat(ownershipListNode.getItemCount(), equalTo(2));

        OwnershipNode ownershipNode2 = ownershipListNode.getItem(1);
        applicationNode.getContext().beginSession();
        ownershipNode.getAverageFlagNode().setValue(Boolean.TRUE);
        ownershipNode2.getAverageFlagNode().setValue(Boolean.TRUE);
        applicationNode.getContext().commitSession();
        assertThat(ownershipNode.getOwnershipPercentageNode().getValue(), equalTo(new BigDecimal("50")));
        assertThat(ownershipNode2.getOwnershipPercentageNode().getValue(), equalTo(new BigDecimal("50")));
        assertThat(ownershipListNode.getTotalOwnership(), equalTo(new BigDecimal("100")));

    }

    @Test
    public void canResetAllValidationErrors() {
        assertThat(applicationNode.getErrorListNode().getItemCount(), equalTo(0));

        applicationNode.refresh();
        assertThat(applicationNode.getErrorListNode().getItemCount(), greaterThan(0));

        applicationNode.resetValidationState();
        assertThat(applicationNode.getErrorListNode().getItemCount(), equalTo(0));
    }

    @Test
    public void referencedNodeShouldReturnNullByDefault() {
        PersonGeneralNode personGeneralNode = personNode.getPersonGeneralNode();
        assertThat(personGeneralNode.getSpouseNode().getValue(), nullValue());

        UiNode<?> spouse = personGeneralNode.getSpouseNode().getReferencedNode();
        assertThat(spouse, nullValue());
    }

    @Test
    public void isDirtyIsUpdatedWhenValueChanges() {
        applicationNode.getContext().setDirtyCheckEnabled(true);
        PersonGeneralNode personGeneralNode = personNode.getPersonGeneralNode();
        assertThat(personGeneralNode.isDirty(), equalTo(false));

        FirstNameNode firstNameNode = personGeneralNode.getFirstNameNode();
        firstNameNode.setValue("test");
        assertThat(firstNameNode.isDirty(), equalTo(true));
        assertThat(personGeneralNode.isDirty(), equalTo(true));
        assertThat(personNode.isDirty(), equalTo(true));

        firstNameNode.setValue("");
        assertThat(firstNameNode.isDirty(), equalTo(false));
        assertThat(personGeneralNode.isDirty(), equalTo(false));
        assertThat(personNode.isDirty(), equalTo(false));
    }

    @Test
    public void addressHaveCorrectDirtyStatus() {

        PersonAddressNode addressNode = this.personContactNode.getCurrentAddressNode();
        assertThat(addressNode.isDirty(), equalTo(false));

        addressNode.getContext().setDirtyCheckEnabled(true);
        addressNode.getAddressLineNode().setValue("22 Jump St.");
        assertThat(addressNode.isDirty(), equalTo(true));

        addressNode.getAddressLineNode().setValue("");
        assertThat(addressNode.isDirty(), equalTo(false));
    }

    @Test
    public void canDisableAWholePanel() {
        PersonAddressNode addressNode = this.personContactNode.getCurrentAddressNode();
        assertThat(addressNode.isEffectivelyDisabled(), equalTo(false));
        assertThat(addressNode.getAddressLineNode().isEffectivelyDisabled(), equalTo(false));

        addressNode.setDisabled(true);
        assertThat(addressNode.isEffectivelyDisabled(), equalTo(true));
        assertThat(addressNode.getAddressLineNode().isEffectivelyDisabled(), equalTo(true));
    }

    @Test
    public void canMakeWholePanelReadonly() {
        PersonAddressNode addressNode = this.personContactNode.getCurrentAddressNode();
        assertThat(addressNode.isEffectivelyReadonly(), equalTo(false));
        assertThat(addressNode.getAddressLineNode().isEffectivelyReadonly(), equalTo(false));

        addressNode.setReadonly(true);
        assertThat(addressNode.isEffectivelyReadonly(), equalTo(true));
        assertThat(addressNode.getAddressLineNode().isEffectivelyReadonly(), equalTo(true));
    }

    @Test
    public void objectNodeIsSetToHasValueWhenChildHasValue() {

        MovedToCurrentAddressNode movedToCurrentAddressNode = personContactNode.getMovedToCurrentAddressNode();
        MonthNode monthNode = movedToCurrentAddressNode.getMonthNode();
        monthNode.setValue(new BigDecimal("12"));
        assertThat(monthNode.hasValue(), equalTo(true));
        assertThat(movedToCurrentAddressNode.hasValue(), equalTo(true));

        YearNode yearNode = movedToCurrentAddressNode.getYearNode();
        yearNode.setValue(new BigDecimal("1999"));
        assertThat(yearNode.getText(), equalTo("1999"));
        assertThat(movedToCurrentAddressNode.hasValue(), equalTo(true));

        yearNode.setValue(null);
        assertThat(yearNode.getText(), equalTo(""));
        assertThat(movedToCurrentAddressNode.hasValue(), equalTo(true));

    }

    @Test
    public void booleanFixedValueValidationWorks() {
        PersonPrivacyNode personPrivacyNode = personNode.getPersonPrivacyNode();
        personPrivacyNode.getCreditCheckFlagNode().setValue(Boolean.FALSE);

        personPrivacyNode.getCreditCheckFlagNode().refresh();

        assertThat(
                TestUtil.hasError(personPrivacyNode.getCreditCheckFlagNode().getValidationErrorList(), BooleanFixedValueValidationRule.class),
                equalTo(true)
        );

        personPrivacyNode.getCreditCheckFlagNode().setValue(Boolean.TRUE);

        assertThat(
                TestUtil.hasError(personPrivacyNode.getCreditCheckFlagNode().getValidationErrorList(), BooleanFixedValueValidationRule.class),
                equalTo(false)
        );
    }

    @Test
    public void firstNameCannotContainHash() {

        boolean exceptionThrown = false;
        try {
            personGeneralNode.getFirstNameNode().setValue("test#");
        } catch (UiNodeEventException ex) {
            exceptionThrown = true;
        }

        assertThat(exceptionThrown, equalTo(true));
        assertThat(context.isInSession(), equalTo(false));

        //no exception
        personGeneralNode.getFirstNameNode().setValue("test2");

    }

    @Test
    public void exceptionInPreRuleWorksInDebouncedMode() {
        context.setCycleMode(CycleModeEnum.Debouncing);
        personGeneralNode.getFirstNameNode().setValue("test#");

        boolean exceptionThrown = false;
        try {
            context.flush();
        } catch (UiNodeEventException ex) {
            exceptionThrown = true;
        }

        assertThat(exceptionThrown, equalTo(true));
        assertThat(context.isInSession(), equalTo(false));
        assertThat(personGeneralNode.getFirstNameNode().getValue(), equalTo(""));

        //no exception
        personGeneralNode.getFirstNameNode().setValue("test2");
        assertThat(personGeneralNode.getFirstNameNode().getValue(), equalTo("test2"));
        assertThat(context.isInSession(), equalTo(true));

        context.flush();
    }

    @Test
    public void applicantTypeShouldHaveDefaultValue() {

        String value = personGeneralNode.getPersonApplicantTypeNode().getValue();

        assertThat(value, equalTo("A"));
        assertThat(personGeneralNode.getPersonApplicantTypeNode().getRequired(), equalTo(true));
        assertThat(personGeneralNode.getPersonApplicantTypeNode().hasValue(), equalTo(true));
    }

    @Test
    public void hasValueHasCorrectInitialValue() {

        assertThat(personGeneralNode.getPersonApplicantTypeNode().hasValue(), equalTo(true));
        assertThat(personGeneralNode.hasValue(), equalTo(true));
        assertThat(personNode.hasValue(), equalTo(true));
        assertThat(applicationNode.getPersonListNode().hasValue(), equalTo(true));
        assertThat(applicationNode.hasValue(), equalTo(true));
    }

    @Test
    public void disableListWillDisableItems() {
        PersonTrustNode personTrustNode = personNode.getPersonTrustNode();
        assertThat(personTrustNode.getTrustTypeNode().hasValue(), equalTo(false));
        assertThat(personTrustNode.getTrustNameNode().isDisabled(), equalTo(true));
        assertThat(personTrustNode.getTrustBeneficiaryListNode().isDisabled(), equalTo(true));
        assertThat(personTrustNode.getTrustBeneficiaryListNode().getItemCount(), equalTo(1));
        assertThat(personTrustNode.getTrustBeneficiaryListNode().getItem(0).isEffectivelyDisabled(), equalTo(true));
    }

    @Test
    public void testUnloadDirectly() {
        FirstNameNode firstNameNode = personGeneralNode.getFirstNameNode();

        personGeneralNode.unloadDirectly();
        assertThat(personGeneralNode.getNodeStatus(), equalTo(NodeStatusEnum.Unloaded));
        assertThat(personGeneralNode.getFirstNameNode(), nullValue());

        personGeneralNode.loadDirectly();
        assertThat(firstNameNode, not(sameInstance(personGeneralNode.getFirstNameNode())));
        assertThat(personGeneralNode.getFirstNameNode().getNodeStatus(), equalTo(NodeStatusEnum.Loaded));

    }

    @Test
    public void employmentTypeShouldNotBeDisabledOnLoad() {
        CurrentEmploymentNode currentEmploymentNode = personNode.getCurrentEmploymentListNode().createItem();
        assertThat(currentEmploymentNode.getEmploymentTypeNode().isDisabled(), equalTo(false));

    }

    @Test
    public void otherTitleNodeIsNotLoadedByDefault() {
        assertThat(personGeneralNode.getOtherTitleNode().getNodeStatus(), equalTo(NodeStatusEnum.Unloaded));
    }

}
