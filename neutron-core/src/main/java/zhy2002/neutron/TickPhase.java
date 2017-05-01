package zhy2002.neutron;

/**
 * Phase configuration.
 * A phase is mainly used to define order of execution
 * within a tick.
 * Currently rule priority is defined as Phase, Priority (not implemented), Activation Order.
 */
public interface TickPhase {

    boolean PostChanges();
}
