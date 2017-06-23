package zhy2002.examples.app.rule;

import zhy2002.examples.app.data.LodgementNodeConstants;
import zhy2002.examples.app.gen.node.GlobalUiStateNode;
import zhy2002.examples.app.gen.node.OpenAppNode;
import zhy2002.examples.app.gen.node.OpenAppsNode;
import zhy2002.examples.app.gen.rule.HandleAddOpenAppActionRule;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.NodeActionEventBinding;
import zhy2002.neutron.config.NeutronConstants;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.ObjectActionEvent;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;


public class HandleAddOpenAppActionRuleImpl extends HandleAddOpenAppActionRule {

    @Inject
    public HandleAddOpenAppActionRuleImpl(@Owner GlobalUiStateNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singleton(
                new NodeActionEventBinding<>(
                        this::handleAction,
                        ObjectActionEvent.class,
                        LodgementNodeConstants.ADD_OPEN_APP
                )
        );
    }

    private void handleAction(ObjectActionEvent event) {
        ApplicationNode applicationNode = (ApplicationNode) event.getParameter();
        OpenAppsNode openAppsNode = getGlobalUiStateNode().getOpenAppsNode();
        for (int i = 0; i < openAppsNode.getItemCount(); i++) {
            OpenAppNode item = openAppsNode.getItem(i);
            ApplicationNode existingApplicationNode = (ApplicationNode) item.getValue();
            if (Objects.equals(applicationNode.getIdNode().getValue(), existingApplicationNode.getIdNode().getValue())) {
                item.setValue(applicationNode);
                getOwner().queueNotification(NeutronConstants.STATE_CHANGE_NOTIFICATION, null);
                return;
            }
        }
        //else add a new one
        OpenAppNode item = getGlobalUiStateNode().getOpenAppsNode().createItem();
        item.setValue(event.getParameter());
    }
}
