package zhy2002.neutron.core;

/**
 * These are the hard coded phases in order.
 * A phase instance is a configuration of how a tick should run.
 * The engine does not know the phases by name.
 */
public enum PredefinedPhases implements TickPhase {

    Pre,
    Post(true),
    Validate;

    private final boolean postChanges;

    PredefinedPhases() {
        this(false);
    }

    PredefinedPhases(boolean postChanges) {

        this.postChanges = postChanges;
    }

    @Override
    public boolean PostChanges() {
        return postChanges;
    }
}
