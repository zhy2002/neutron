package zhy2002.neutron;

/**
 * An interface used to observe the current status of the engine.
 */
public interface UiNodeChangeEngineStatus {

    boolean isInSession();

    boolean isInCycle();

    CycleStatus getCurrentCycleStatus();
}
