package zhy2002.examples.app.rule;

import zhy2002.examples.app.data.AddOpenAppActionEvent;
import zhy2002.examples.app.gen.node.GlobalUiStateNode;
import zhy2002.examples.app.gen.node.OpenAppNode;
import zhy2002.examples.app.gen.rule.HandleAddOpenAppActionRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.NodeActionEventBinding;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;


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
                        AddOpenAppActionEvent.class
                )
        );
    }

    private void handleAction(AddOpenAppActionEvent event) {
        OpenAppNode item = getGlobalUiStateNode().getOpenAppsNode().createItem();
        item.setValue(event.getParameter());
    }
}
