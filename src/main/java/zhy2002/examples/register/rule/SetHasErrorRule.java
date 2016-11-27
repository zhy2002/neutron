package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorNode;
import zhy2002.examples.register.RegisterNode;
import zhy2002.examples.register.event.ErrorNodeAddEvent;
import zhy2002.neutron.PredefinedPhases;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.rule.UiNodeRule;

public class SetHasErrorRule extends UiNodeRule<ErrorNodeAddEvent, RegisterNode> {


    public SetHasErrorRule(RegisterNode owner ) {
        super(owner, PredefinedPhases.Post);
    }

    @Override
    protected void execute(ErrorNodeAddEvent typedEvent) {
        getOwner().setHasError(true);
    }

    @Override
    public Class<ErrorNodeAddEvent> getEventType() {
        return ErrorNodeAddEvent.class;
    }

    @Override
    public boolean isObservedUiNode(UiNode<?> eventTarget) {
        return eventTarget instanceof ErrorNode;
    }
}
