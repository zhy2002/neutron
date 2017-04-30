package zhy2002.neutron;

/**
 * Phase configuration.
 * A phase is mainly used to define order of execution
 * within a tick.
 */
public interface TickPhase {

    ChangeModeEnum getChangeMode();

    boolean PostChanges();
}
