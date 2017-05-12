package zhy2002.examples.lodgement;

import com.google.gwt.i18n.shared.DateTimeFormat;
import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.CountingChangeListener;
import zhy2002.examples.lodgement.data.Telephone;
import zhy2002.examples.lodgement.di.ApplicationNodeFactory;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.gen.rule.DobRangeValidationRule;
import zhy2002.examples.lodgement.gen.rule.TelephoneCompleteRule;
import zhy2002.examples.lodgement.gen.rule.TitleGenderMatchRule;
import zhy2002.examples.lodgement.node.ApplicationNodeImpl;
import zhy2002.neutron.rule.LeafValueRequiredValidationRule;
import zhy2002.neutron.rule.ObjectValueRequiredValidationRule;
import zhy2002.neutron.util.SharedDateTimeFormat;

import java.util.Date;
import java.util.function.Predicate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ApplicationNodeTest {

    private ApplicationNode applicationNode;

    @Before
    public void setup() {
        applicationNode = ApplicationNodeFactory.create();
    }

    @Test
    public void selectedPersonIndexDefaultsTo0() {
        PersonListNode personListNode = applicationNode.getPersonListNode();

        assertThat(personListNode.getSelectedIndex(), equalTo(0));
    }

    @Test
    public void shouldSetShowErrorListToTrueWhenRefresh() {
        applicationNode.getSubmissionNode().setDisabled(true);
        applicationNode.getRealEstateListNode().setDisabled(true);

        assertThat(applicationNode.getShowErrorList(), equalTo(false));

        PersonNode personNode = applicationNode.getPersonListNode().createItem();

        applicationNode.refresh();

        assertThat(applicationNode.getShowErrorList(), equalTo(true));

        applicationNode.setShowErrorList(Boolean.FALSE);

        applicationNode.refresh();

        assertThat(applicationNode.getShowErrorList(), equalTo(true));

        applicationNode.getPersonListNode().removeItem(personNode);

        applicationNode.refresh();

        assertThat(applicationNode.getShowErrorList(), equalTo(false));

    }

    @Test
    public void shouldRectifySelectedIndexWhenPersonNodeIsRemoved() {

        PersonListNode personListNode = applicationNode.getPersonListNode();
        personListNode.createItem();
        personListNode.createItem();
        personListNode.setSelectedIndex(1);

        personListNode.removeByIndex(1);

        assertThat(personListNode.getSelectedIndex(), equalTo(0));

        personListNode.createItem();
        personListNode.removeByIndex(0);

        assertThat(personListNode.getSelectedIndex(), equalTo(0));

        personListNode.removeByIndex(0);
        assertThat(personListNode.getSelectedIndex(), equalTo(0));

    }

    @Test
    public void titleAndGenderShouldMatch() {
        PersonListNode personListNode = applicationNode.getPersonListNode();
        PersonNode personNode = personListNode.createItem();
        TitleNode titleNode = personNode.getPersonGeneralNode().getTitleNode();
        GenderNode genderNode = personNode.getPersonGeneralNode().getGenderNode();

        Predicate<ErrorNode> hasTitleGenderMismatch = errorNode -> errorNode.getRule() instanceof TitleGenderMatchRule;

        assertThat(hasError(hasTitleGenderMismatch), equalTo(false));

        titleNode.setValue("Mr");

        assertThat(hasError(hasTitleGenderMismatch), equalTo(false));

        genderNode.setValue("Female");

        assertThat(hasError(hasTitleGenderMismatch), equalTo(true));

        titleNode.setValue("Mrs");

        assertThat(hasError(hasTitleGenderMismatch), equalTo(false));

    }

    @Test
    public void phoneInfoShouldBeComplete() {
        PersonListNode personListNode = applicationNode.getPersonListNode();
        PersonNode personNode = personListNode.createItem();
        TelephoneNode<?> phoneNumberNode = personNode.getPersonContactNode().getHomePhoneNode();

        Predicate<ErrorNode> hasTelephoneCompleteError = errorNode -> errorNode.getRule() instanceof TelephoneCompleteRule;

        assertThat(hasError(hasTelephoneCompleteError), equalTo(false));

        phoneNumberNode.setValue(new Telephone());

        Telephone newValue = phoneNumberNode.getCopyOfValue();
        newValue.setCountryCode("61");
        phoneNumberNode.setValue(newValue);
        assertThat(hasError(hasTelephoneCompleteError), equalTo(true));

        newValue = phoneNumberNode.getCopyOfValue();
        newValue.setAreaCode("2");
        phoneNumberNode.setValue(newValue);
        assertThat(hasError(hasTelephoneCompleteError), equalTo(true));

        phoneNumberNode.setSuppressTelephoneCompleteRule(true);
        assertThat(hasError(hasTelephoneCompleteError), equalTo(false));

        phoneNumberNode.setSuppressTelephoneCompleteRule(false);
        assertThat(hasError(hasTelephoneCompleteError), equalTo(true));

        newValue = phoneNumberNode.getCopyOfValue();
        newValue.setPhoneNumber("119");
        phoneNumberNode.setValue(newValue);
        assertThat(hasError(hasTelephoneCompleteError), equalTo(false));

    }

    private boolean hasError(Predicate<ErrorNode> predicate) {

        ErrorListNode errorListNode = applicationNode.getErrorListNode();
        for (int i = 0; i < errorListNode.getItemCount(); i++) {
            ErrorNode errorNode = errorListNode.getItem(i);
            if (predicate.test(errorNode))
                return true;
        }
        return false;
    }

    @Test
    public void oneOfHomePhoneOrWorkPhoneIsRequired() {
        PersonListNode personListNode = applicationNode.getPersonListNode();
        PersonNode personNode = personListNode.createItem();
        PersonContactNode contactNode = personNode.getPersonContactNode();

        assertThat(contactNode.getHomePhoneNode().getRequired(), equalTo(true));
        assertThat(contactNode.getWorkPhoneNode().getRequired(), equalTo(true));

        Telephone telephone = new Telephone();
        telephone.setPhoneNumber("123345");
        contactNode.getHomePhoneNode().setValue(telephone);

        assertThat(contactNode.getWorkPhoneNode().getRequired(), equalTo(false));

        assertThat(hasError(errorNode -> errorNode.getRule() instanceof LeafValueRequiredValidationRule), equalTo(false));
    }

    @Test
    public void hasValueShouldWorkAsExpected() {
        PersonListNode personListNode = applicationNode.getPersonListNode();
        PersonNode personNode = personListNode.createItem();
        PersonContactNode contactNode = personNode.getPersonContactNode();

        assertThat(contactNode.getHomePhoneNode().getValue().getCountryCode(), equalTo("+61"));

        assertThat(contactNode.hasValue(), equalTo(false));

        Telephone telephone = new Telephone();
        telephone.setPhoneNumber("119");
        contactNode.getHomePhoneNode().setValue(telephone);

        assertThat(contactNode.getHomePhoneNode().hasValue(), equalTo(true));
        assertThat(contactNode.hasValue(), equalTo(true));

        contactNode.getHomePhoneNode().setValue(new Telephone());
        assertThat(contactNode.hasValue(), equalTo(true));

        contactNode.getHomePhoneNode().setValue(new Telephone("+61"));
        assertThat(contactNode.hasValue(), equalTo(false));
    }

    @Test
    public void requiredAddressErrorCanBeRemoved() {

        PersonListNode personListNode = applicationNode.getPersonListNode();
        PersonNode personNode = personListNode.createItem();
        PersonContactNode contactNode = personNode.getPersonContactNode();

        contactNode.refresh();

        Predicate<ErrorNode> addressRequiredError = errorNode ->
                errorNode.getRule() instanceof ObjectValueRequiredValidationRule
                        && errorNode.getSource() instanceof AddressNode;

        assertThat(hasError(addressRequiredError), equalTo(true));

        contactNode.getCurrentAddressNode().getAddressLineNode().setValue("4 Pioneer Road");
        assertThat(hasError(addressRequiredError), equalTo(false));
    }

    @Test
    public void validationErrorsAreClearedWhenDisabled() {

        PersonListNode personListNode = applicationNode.getPersonListNode();
        assertThat(applicationNode.getErrorListNode().getItemCount(), equalTo(0));

        PersonNode personNode = personListNode.createItem();
        personNode.refresh();
        assertThat(applicationNode.getErrorListNode().getItemCount(), greaterThan(0));

        personNode.setDisabled(true);
        assertThat(applicationNode.getErrorListNode().getItemCount(), equalTo(0));
    }

    @Test
    public void employerAddressShouldLoadUpfront() {
        PersonListNode personListNode = applicationNode.getPersonListNode();
        PersonNode personNode = personListNode.createItem();
        CurrentEmploymentListNode currentEmploymentListNode = personNode.getCurrentEmploymentListNode();
        CurrentEmploymentNode currentEmploymentNode = currentEmploymentListNode.createItem();
        PayeEmployedNode payeEmployedNode = currentEmploymentNode.getPayeEmployedNode();
        assertThat(payeEmployedNode.getEmployerAddressNode(), not(nullValue()));
    }

    @Test
    public void canUseSharedDateTimeFormatInJUnit() {
        DateTimeFormat format = new SharedDateTimeFormat();
        Date date = format.parse("2027-01-04T00:00:00Z");
        DateTimeFormat yearFormat = new SharedDateTimeFormat("yyyy");
        assertThat(yearFormat.format(date), equalTo("2027"));
    }

    @Test
    public void shouldValidateMinAndMaxAge() {
        //todo mock current date as 2017-01-31
        PersonListNode personListNode = applicationNode.getPersonListNode();
        PersonNode personNode = personListNode.createItem();
        personNode.getPersonGeneralNode().getDateOfBirthNode().setValue("2017-4-14");
        assertThat(hasError(errorNode -> errorNode.getRule() instanceof DobRangeValidationRule), equalTo(true));

        personNode.getPersonGeneralNode().getDateOfBirthNode().setValue("1997-4-14");
        assertThat(hasError(errorNode -> errorNode.getRule() instanceof DobRangeValidationRule), equalTo(false));
    }

    @Test
    public void personOtherIncomeDescriptionIsDisabledWhenTypeIsNotOtherIncome() {
        PersonListNode personListNode = applicationNode.getPersonListNode();
        PersonNode personNode = personListNode.createItem();
        OtherIncomeNode personOtherIncomeNode = personNode.getPersonOtherIncomeListNode().createItem();

        assertThat(personOtherIncomeNode.getOtherIncomeTypeNode().getValue(), equalTo("Other Income"));
        assertThat(personOtherIncomeNode.getOtherIncomeDescriptionNode().isDisabled(), equalTo(false));
        personOtherIncomeNode.getOtherIncomeDescriptionNode().setValue("test");

        personOtherIncomeNode.getOtherIncomeTypeNode().setValue("");
        assertThat(personOtherIncomeNode.getOtherIncomeDescriptionNode().isDisabled(), equalTo(true));
        assertThat(personOtherIncomeNode.getOtherIncomeDescriptionNode().getValue(), equalTo(""));

        personOtherIncomeNode.getOtherIncomeTypeNode().setValue("Other Income");
        assertThat(personOtherIncomeNode.getOtherIncomeDescriptionNode().isDisabled(), equalTo(false));

        Object[] array = (Object[]) personOtherIncomeNode.getOtherIncomeTypeNode().getOptions();
        assertThat(array.length, greaterThan(3));
    }

    @Test
    public void companyOtherIncomeTypeHasThreeOptions() {
        CompanyListNode companyListNode = applicationNode.getCompanyListNode();
        CompanyNode companyNode = companyListNode.createItem();
        OtherIncomeNode otherIncomeNode = companyNode.getCompanyOtherIncomeListNode().createItem();

        assertThat(otherIncomeNode.getOtherIncomeTypeNode().getValue(), equalTo("Add Back"));

        Object[] array = (Object[]) otherIncomeNode.getOtherIncomeTypeNode().getOptions();
        assertThat(array.length, equalTo(3));
    }

    @Test
    public void shouldFireRefreshEventWhenNodeLoads() {
        PersonListNode personListNode = applicationNode.getPersonListNode();
        PersonNode personNode = personListNode.createItem();
        PersonTrustNode personTrustNode = personNode.getPersonTrustNode();
        assertThat(personTrustNode.getTrustNameNode().isDisabled(), equalTo(true));
        assertThat(personTrustNode.getTrustRegistrationDateNode().isDisabled(), equalTo(true));

        personTrustNode.getTrustTypeNode().setValue("Family Trust");
        assertThat(personTrustNode.getTrustNameNode().isDisabled(), equalTo(false));
        assertThat(personTrustNode.getTrustRegistrationDateNode().isDisabled(), equalTo(false));
    }

    @Test
    public void shouldUpdateSelectedIndexWhenSetContentNode() {
        CountingChangeListener myListener = new CountingChangeListener();
        ApplicationNodeImpl applicationNodeImpl = (ApplicationNodeImpl) applicationNode;
        applicationNodeImpl.addChangeListener(myListener);

        assertThat(applicationNodeImpl.hasValue(), equalTo(true));

        PersonListNode personListNode = applicationNode.getPersonListNode();
        PersonNode personNode1 = personListNode.createItem();
        PersonNode personNode2 = personListNode.createItem();
        PersonNode personNode3 = personListNode.createItem();

        assertThat(myListener.getCount(), equalTo(0));

        applicationNodeImpl.setContentNode(personNode1);
        assertThat(applicationNodeImpl.getContentLevel(), equalTo(2));
        assertThat(personListNode.getSelectedIndex(), equalTo(0));

        applicationNodeImpl.setContentNode(personNode3);
        assertThat(applicationNodeImpl.getContentLevel(), equalTo(2));
        assertThat(personListNode.getSelectedIndex(), equalTo(2));

        applicationNodeImpl.setContentNode(personListNode);
        assertThat(applicationNodeImpl.getContentLevel(), equalTo(1));
        assertThat(applicationNodeImpl.getSelectedName(), equalTo(personListNode.getName()));

        applicationNodeImpl.setContentNode(personNode2);
        assertThat(applicationNodeImpl.getContentLevel(), equalTo(2));
        assertThat(personListNode.getSelectedIndex(), equalTo(1));

        assertThat(myListener.getCount(), equalTo(4));

    }

    @Test
    public void listItemIndexIsSetCorrectly() {
        PersonListNode personListNode = applicationNode.getPersonListNode();

        PersonNode personNode1 = personListNode.createItem();
        assertThat(personNode1.getIndex(), equalTo(0));

        PersonNode personNode2 = personListNode.createItem();
        assertThat(personNode2.getIndex(), equalTo(1));

        personListNode.removeItem(personNode1);
        assertThat(personNode1.getIndex(), equalTo(-1));
        assertThat(personNode2.getIndex(), equalTo(0));

        personListNode.removeItem(personNode2);
        assertThat(personNode2.getIndex(), equalTo(-1));
    }

    @Test
    public void personNodeLabelIsCorrectlySet() {
        PersonListNode personListNode = applicationNode.getPersonListNode();

        PersonNode personNode1 = personListNode.createItem();
        assertThat(personNode1.getNodeLabel(), equalTo("[Person 1]"));

        PersonNode personNode2 = personListNode.createItem();
        assertThat(personNode2.getNodeLabel(), equalTo("[Person 2]"));

        personNode1.getPersonGeneralNode().getFirstNameNode().setValue("John");
        personNode1.getPersonGeneralNode().getLastNameNode().setValue("Rambo");
        assertThat(personNode1.getNodeLabel(), equalTo("John Rambo"));
    }

    @Test
    public void ownershipCanAddExistingPersonApplicants() {
        PersonListNode personListNode = applicationNode.getPersonListNode();

        PersonNode personNode1 = personListNode.createItem();
        PersonNode personNode2 = personListNode.createItem();

        FinancialPositionNode financialPositionNode = applicationNode.getFinancialPositionNode();
        AssetsNode assetsNode = financialPositionNode.getAssetsNode();
        SavingsAccountListNode savingsAccountListNode = assetsNode.getSavingsAccountListNode();
        SavingsAccountNode savingsAccountNode = savingsAccountListNode.createItem();
        OwnershipListNode<?> ownershipListNode = savingsAccountNode.getOwnershipListNode();

        assertThat(ownershipListNode.getItemCount(), equalTo(2));
        assertThat(ownershipListNode.getItem(0).getApplicantReferenceNode().getValue(), equalTo(personNode1.getPath()));
        assertThat(ownershipListNode.getItem(1).getApplicantReferenceNode().getValue(), equalTo(personNode2.getPath()));

        personListNode.removeItem(personNode1);
        assertThat(ownershipListNode.getItemCount(), equalTo(1));
        assertThat(ownershipListNode.getItem(0).getApplicantReferenceNode().getValue(), equalTo(personNode2.getPath()));

        PersonNode personNode3 = personListNode.createItem();
        assertThat(ownershipListNode.getItemCount(), equalTo(2));
        assertThat(ownershipListNode.getItem(1).getApplicantReferenceNode().getValue(), equalTo(personNode3.getPath()));
    }

    @Test
    public void newItemInOwnershipListWhenAddingCompany() {
        FinancialPositionNode financialPositionNode = applicationNode.getFinancialPositionNode();
        AssetsNode assetsNode = financialPositionNode.getAssetsNode();
        SavingsAccountNode savingsAccountNode = assetsNode.getSavingsAccountListNode().createItem();
        SavingsOwnershipListNode ownershipListNode = savingsAccountNode.getOwnershipListNode();
        assertThat(ownershipListNode.getItemCount(), equalTo(0));

        CompanyNode companyNode = applicationNode.getCompanyListNode().createItem();
        assertThat(ownershipListNode.getItemCount(), equalTo(1));
        assertThat(ownershipListNode.getItem(0).getApplicantReferenceNode().getReferencedNode(), sameInstance(companyNode));
    }

    @Test
    public void canValidatePartOfNodeHierarchy() {
        ProductFeeListNode productFeeListNode = applicationNode.getProductsNode().getProductFeeListNode();
        ProductFeeNode productFeeNode = productFeeListNode.createItem();
        assertThat(productFeeNode.hasError(), equalTo(false));

        productFeeNode.refresh();
        assertThat(productFeeNode.hasError(), equalTo(true));
    }

    @Test
    public void listShouldBeSetToDirtyWhenAddingItems() {
        PersonListNode personListNode = applicationNode.getPersonListNode();

        assertThat(applicationNode.isDirty(), equalTo(false));
        assertThat(personListNode.isDirty(), equalTo(false));

        applicationNode.getContext().setDirtyCheckEnabled(true);
        PersonNode personNode = personListNode.createItem();

        assertThat(personListNode.isDirty(), equalTo(true));
        assertThat(personNode.isDirty(), equalTo(true));

        personNode.getPersonGeneralNode().getFirstNameNode().setValue("test");

        personListNode.removeItem(personNode);
        assertThat(personListNode.isDirty(), equalTo(false));

    }

    @Test
    public void canResetDirty() {
        applicationNode.getContext().setDirtyCheckEnabled(true);
        PersonListNode personListNode = applicationNode.getPersonListNode();
        PersonNode personNode = personListNode.createItem();
        personNode.getPersonGeneralNode().getFirstNameNode().setValue("test");

        assertThat(personNode.isDirty(), equalTo(true));

        applicationNode.getContext().resetDirty();

        assertThat(personNode.isDirty(), equalTo(false));
        assertThat(personNode.getPersonGeneralNode().isDirty(), equalTo(false));

    }

    @Test
    public void canSelectDescendant() {
        applicationNode.selectDescendant("productsNode/productFeeListNode");
        assertThat(applicationNode.getSelectedName(), equalTo("productsNode"));
        assertThat(applicationNode.getProductsNode().getSelectedName(), equalTo("productFeeListNode"));
        assertThat(applicationNode.getContentLevel(), equalTo(2));
    }

    @Test
    public void canSelectDescendantAndTab() {
        PersonNode personNode = applicationNode.getPersonListNode().createItem();
        applicationNode.selectDescendant("personListNode/0?select=currentEmploymentListNode");
        assertThat(applicationNode.getSelectedName(), equalTo("personListNode"));
        assertThat(applicationNode.getPersonListNode().getSelectedIndex(), equalTo(0));
        assertThat(applicationNode.getContentLevel(), equalTo(2));
        assertThat(personNode.getSelectedName(), equalTo("currentEmploymentListNode"));

    }

    @Test
    public void requiredPropertyOnlyTriggerChangeWhenValueChanged() {

        assertThat(new Boolean("false"), not(sameInstance(new Boolean("false"))));

        CountingChangeListener listener = new CountingChangeListener();
        applicationNode.addChangeListener(listener);
        applicationNode.setRequired(Boolean.FALSE);

        assertThat(listener.getCount(), equalTo(1));

        applicationNode.setRequired(new Boolean("false"));

        assertThat(listener.getCount(), equalTo(1));

    }
}
