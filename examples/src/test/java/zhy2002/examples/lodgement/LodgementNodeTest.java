package zhy2002.examples.lodgement;

import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.lodgement.data.Telephone;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.TelephoneCompleteRule;
import zhy2002.examples.lodgement.gen.rule.TitleGenderMatchRule;

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
        TitleNode titleNode = personNode.getGeneralNode().getTitleNode();
        GenderNode genderNode = personNode.getGeneralNode().getGenderNode();

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
        TelephoneNode<?> phoneNumberNode = personNode.getContactNode().getHomePhoneNode();

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
}
