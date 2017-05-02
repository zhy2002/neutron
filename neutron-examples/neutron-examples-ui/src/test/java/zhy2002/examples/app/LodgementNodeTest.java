package zhy2002.examples.app;


import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.app.di.LodgementNodeFactory;
import zhy2002.examples.app.gen.node.LodgementNode;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LodgementNodeTest {

    private LodgementNode lodgementNode;

    @Before
    public void setup() {
        lodgementNode = LodgementNodeFactory.create();
    }

    @Test
    public void noExceptionThrownWhileLoading() {

        assertThat(lodgementNode.getAppManagerNode().getApplicationListNode(), notNullValue());
    }
}
