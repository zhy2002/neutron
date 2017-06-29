package zhy2002.mortgage.manager.rule;

import zhy2002.mortgage.manager.gen.event.OpenAppNodeAddEvent;
import zhy2002.mortgage.manager.gen.event.OpenAppNodeRemoveEvent;
import zhy2002.mortgage.manager.gen.node.GlobalUiStateNode;
import zhy2002.mortgage.manager.gen.rule.UpdateSelectedTabIndexRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.NodeAddEventBinding;
import zhy2002.neutron.NodeRemoveEventBinding;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;


public class UpdateSelectedTabIndexRuleImpl extends UpdateSelectedTabIndexRule {

    @Inject
    public UpdateSelectedTabIndexRuleImpl(@Owner GlobalUiStateNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new NodeAddEventBinding<>(
                        this::handleAdd,
                        OpenAppNodeAddEvent.class
                ),
                new NodeRemoveEventBinding<>(
                        this::handleRemove,
                        OpenAppNodeRemoveEvent.class
                )
        );
    }

    private void handleAdd(OpenAppNodeAddEvent event) {
        getGlobalUiStateNode().setSelectedTabIndex(getGlobalUiStateNode().getOpenAppsNode().getItemCount()); //select the last one
    }

    private void handleRemove(OpenAppNodeRemoveEvent event) {
        if (getGlobalUiStateNode().getSelectedTabIndex() > getGlobalUiStateNode().getOpenAppsNode().getItemCount()) {
            getGlobalUiStateNode().setSelectedTabIndex(getGlobalUiStateNode().getOpenAppsNode().getItemCount());
        }
    }

}
