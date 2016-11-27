package zhy2002.neutron;

/**
 * These are the hard coded phases in order.
 * A phase instance is a configuration of how a tick should run.
 * The engine does not know the phases by name.
 */
public enum PredefinedPhases implements TickPhase {

    Pre(ChangeModeEnum.PROHIBITED),
    Post(ChangeModeEnum.CASCADE, true),
    Validate(ChangeModeEnum.DIRECT),
    CleanUp(ChangeModeEnum.IGNORED);

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
