package zhy2002.examples.lodgement;

import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.lodgement.gen.ApplicationNode;
import zhy2002.examples.lodgement.gen.PersonListNode;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LodgementNodeTest {

    private ApplicationNode applicationNode;

    @Before
    public void setup() {
        applicationNode = ApplicationNodeFactory.create();
    }

    @Test
    public void test1() {
        PersonListNode personListNode = applicationNode.getPersonListNode();

        assertThat(personListNode.getSelectedIndex(), equalTo(0));
    }
}
