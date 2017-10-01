package zhy2002.neutron.core;

import jsinterop.annotations.JsIgnore;
import zhy2002.neutron.core.util.ValueUtil;

/**
 * An action raised in Js to trigger node hierarchy state change.
 *
 * @param <T> type of the action parameter.
 *            This usually is a js native type.
 */
public abstract class NodeActionEvent<T> extends UiNodeEvent {

    private final T parameter;
    private final UiNodeDirectionEnum direction;

    @JsIgnore
    protected NodeActionEvent(
            UiNode<?> origin,
            String subject,
            T parameter
    ) {
        this(origin, subject, parameter, null);
    }

    protected NodeActionEvent(
            UiNode<?> origin,
            String subject,
            T parameter,
            UiNodeDirectionEnum direction
    ) {
        super(origin, subject);
        assert subject != null;

        this.parameter = parameter;
        this.direction = ValueUtil.ifNull(direction, UiNodeDirectionEnum.Up);
    }

    public T getParameter() {
        return parameter;
    }

    public UiNodeDirectionEnum getDirection() {
        return direction;
    }

    @Override
    public Iterable<BindingActivation> getActivations() {
        return direction.getActivations(this);
    }
}
