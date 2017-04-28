package zhy2002.neutron.util;

import zhy2002.neutron.ChangeModeEnum;
import zhy2002.neutron.TickPhase;

/**
 * These are the hard coded phases in order.
 * A phase instance is a configuration of how a tick should run.
 * The engine does not know the phases by name.
 */
public enum PredefinedPhases implements TickPhase {

    Pre(ChangeModeEnum.CASCADE),
    Post(ChangeModeEnum.CASCADE, true),
    Validate(ChangeModeEnum.CASCADE);

    private final ChangeModeEnum changeMode;
    private final boolean postChanges;

    PredefinedPhases(ChangeModeEnum changeMode) {
        this(changeMode, false);
    }

    PredefinedPhases(ChangeModeEnum changeMode, boolean postChanges) {
        this.changeMode = changeMode;
        this.postChanges = postChanges;
    }

    @Override
    public ChangeModeEnum getChangeMode() {
        return changeMode;
    }

    @Override
    public boolean PostChanges() {
        return postChanges;
    }
}
