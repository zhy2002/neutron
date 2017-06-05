package zhy2002.examples.app;


import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.app.di.GlobalUiStateNodeFactory;
import zhy2002.examples.app.gen.node.GlobalUiStateNode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GlobalUiStateNodeTest {

    private GlobalUiStateNode globalUiStateNodeNode;

    @Before
    public void setup() {
        globalUiStateNodeNode = GlobalUiStateNodeFactory.create();
    }

    @Test
    public void noExceptionThrownWhileLoading() {

        assertThat(globalUiStateNodeNode.getAppManagerNode().getApplicationListNode(), notNullValue());
    }
}
