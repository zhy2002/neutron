package zhy2002.examples.lodgement;

import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.lodgement.data.Telephone;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.TelephoneCompleteRule;
import zhy2002.examples.lodgement.gen.rule.TitleGenderMatchRule;
import zhy2002.neutron.rule.LeafValueRequiredValidationRule;
import zhy2002.neutron.rule.ObjectValueRequiredValidationRule;

import java.util.function.Predicate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LodgementNodeTest {

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

        newValue = phoneNumberNode.getCopyOfValue();
        newValue.setPhoneNumber("119");
        phoneNumberNode.setValue(newValue);

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

        assertThat(contactNode.hasValue(), equalTo(false));

        Telephone telephone = new Telephone();
        telephone.setPhoneNumber("119");
        contactNode.getHomePhoneNode().setValue(telephone);

        assertThat(contactNode.getHomePhoneNode().hasValue(), equalTo(true));
        assertThat(contactNode.hasValue(), equalTo(true));

        contactNode.getHomePhoneNode().setValue(new Telephone());
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
}
