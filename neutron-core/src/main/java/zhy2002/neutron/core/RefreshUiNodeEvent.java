package zhy2002.neutron.core;

import zhy2002.neutron.core.config.NeutronConstants;

/**
 * An event that can only trigger post change rules.
 */
public class RefreshUiNodeEvent extends UiNodeEvent {

    protected RefreshUiNodeEvent(UiNode<?> origin) {
        this(origin, null);
    }

    protected RefreshUiNodeEvent(UiNode<?> origin, String reason) {
        super(origin, reason == null ? NeutronConstants.DEFAULT_REFRESH_REASON : reason);
    }

    @Override
    public Iterable<BindingActivation> getActivations() {
        return UiNodeDirectionEnum.Down.getActivations(this);
    }

}
