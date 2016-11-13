package zhy2002.neutron.event;

/**
 * These are the hard coded phases in order.
 * A phase instance is a configuration of how a tick should run.
 * The engine does not know the phases by name.
 */
public enum DefaultPhases implements TickPhase {

    Pre(ChangeMode.PROHIBITED),
    Post(ChangeMode.CASCADE, true),
    Validate(ChangeMode.DIRECT),
    CleanUp(ChangeMode.IGNORED);

    private final ChangeMode changeMode;
    private final boolean postChanges;

    DefaultPhases(ChangeMode changeMode) {
        this(changeMode, false);
    }

    DefaultPhases(ChangeMode changeMode, boolean postChanges) {
        this.changeMode = changeMode;
        this.postChanges = postChanges;
    }

    @Override
    public ChangeMode getChangeMode() {
        return changeMode;
    }

    @Override
    public boolean PostChanges() {
        return postChanges;
    }
}
