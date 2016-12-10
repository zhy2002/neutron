package zhy2002.neutron;

/**
 * Implementor of this interface is responsible for propagation changes in the form of a UiNodeEvent
 * through the UiNode tree.
 */
public interface UiNodeChangeEngine {

    CycleModeEnum getCycleMode();

    void processEvent(UiNodeEvent event);

    TickPhase getCurrentPhase();

    void beginSession();

    void commitSession();

    void rollbackSession();

    boolean isInSession();

    boolean inCycle();

    boolean undo();

    boolean redo();
}
