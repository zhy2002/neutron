package zhy2002.mortgage.manager;

import org.junit.Before;
import org.junit.Test;
import zhy2002.mortgage.manager.di.GlobalUiStateNodeFactory;
import zhy2002.mortgage.manager.gen.node.GlobalUiStateNode;
import zhy2002.mortgage.manager.gen.node.OpenAppNode;
import zhy2002.mortgage.manager.gen.node.OpenAppsNode;
import zhy2002.mortgage.application.di.ApplicationNodeFactory;
import zhy2002.neutron.core.CycleModeEnum;
import zhy2002.neutron.core.UiNodeContext;
import zhy2002.neutron.core.test.CountingChangeListener;

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
        Object testObject = ApplicationNodeFactory.create("BankB", null);
        globalUiStateNodeNode.dispatchAddOpenAppAction(testObject);

        assertThat(globalUiStateNodeNode.getOpenAppsNode().getItemCount(), equalTo(1));
        assertThat(globalUiStateNodeNode.getOpenAppsNode().getItem(0).getValue(), sameInstance(testObject));
    }
}
