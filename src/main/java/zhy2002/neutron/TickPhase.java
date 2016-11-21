package zhy2002.neutron;

/**
 * Phase configuration.
 */
public interface TickPhase {

    ChangeModeEnum getChangeMode();

    boolean PostChanges();
}
