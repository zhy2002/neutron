package zhy2002.examples.app;


import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.CountingChangeListener;
import zhy2002.examples.app.di.GlobalUiStateNodeFactory;
import zhy2002.examples.app.gen.node.GlobalUiStateNode;
import zhy2002.examples.app.gen.node.OpenAppNode;
import zhy2002.examples.app.gen.node.OpenAppsNode;
import zhy2002.examples.interop.JavaMethods;
import zhy2002.examples.lodgement.ApplicationNodeContextImpl;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.neutron.CycleModeEnum;
import zhy2002.neutron.UiNodeContext;

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

    @Test
    public void addItemWorksInBatchMode() {
        UiNodeContext<?> context = globalUiStateNodeNode.getContext();
        OpenAppsNode openAppsNode = globalUiStateNodeNode.getOpenAppsNode();
        CountingChangeListener listener = new CountingChangeListener();
        openAppsNode.addChangeListener(listener);

        context.beginSession();
        context.setCycleMode(CycleModeEnum.Batched);
        OpenAppNode node = openAppsNode.createItem();
        Object testObject = new Object();
        node.setValue(testObject);
        assertThat(node, notNullValue());
        assertThat(openAppsNode.getItemCount(), equalTo(0));
        assertThat(node.getValue(), sameInstance(testObject));
        assertThat(listener.getCount(), equalTo(0));

        context.flush();
        assertThat(openAppsNode.getItemCount(), equalTo(1));
        context.commitSession();

    }

    @Test
    public void shouldUpdateSelectedTabIndexWhenOpenAppNodeIsAddedOrRemoved() {
        assertThat(globalUiStateNodeNode.getSelectedTabIndex(), equalTo(0));

        OpenAppsNode openAppsNode = globalUiStateNodeNode.getOpenAppsNode();
        OpenAppNode item1 = openAppsNode.createItem();
        assertThat(globalUiStateNodeNode.getSelectedTabIndex(), equalTo(1));

        OpenAppNode item2 = openAppsNode.createItem();
        assertThat(globalUiStateNodeNode.getSelectedTabIndex(), equalTo(2));

        openAppsNode.removeItem(item2);
        assertThat(globalUiStateNodeNode.getSelectedTabIndex(), equalTo(1));

        openAppsNode.removeItem(item1);
        assertThat(globalUiStateNodeNode.getSelectedTabIndex(), equalTo(0));

    }

    @Test
    public void addOpenAppActionWorksAsExpected() {
        Object testObject = JavaMethods.createApplicationNode("BankB", null);
        globalUiStateNodeNode.dispatchAddOpenAppAction(testObject);

        assertThat(globalUiStateNodeNode.getOpenAppsNode().getItemCount(), equalTo(1));
        assertThat(globalUiStateNodeNode.getOpenAppsNode().getItem(0).getValue(), sameInstance(testObject));
    }
}
