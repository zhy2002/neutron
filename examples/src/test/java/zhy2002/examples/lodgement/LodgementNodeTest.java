package zhy2002.examples.lodgement;

import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.lodgement.gen.ApplicationNode;
import zhy2002.examples.lodgement.gen.PersonListNode;
import zhy2002.examples.lodgement.gen.PersonNode;

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

        //todo fix this assertThat(applicationNode.getShowErrorList(), equalTo(false));

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
}
