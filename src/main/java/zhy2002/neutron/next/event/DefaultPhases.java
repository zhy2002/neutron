package zhy2002.neutron.next.event;

/**
 * These are the hard coded phases in order.
 * A phase instance is a configuration of how a tick should run.
 * The engine does not know the phases by name.
 */
public enum DefaultPhases implements TickPhase {

    Pre(ChangeMode.PROHIBITED),
    Post(ChangeMode.CASCADE),
    Validate(ChangeMode.DIRECT),
    CleanUp(ChangeMode.IGNORED);

    private final ChangeMode changeMode;

    DefaultPhases(ChangeMode changeMode) {
        this.changeMode = changeMode;
    }

    @Override
    public ChangeMode getChangeMode() {
        return changeMode;
    }
}
