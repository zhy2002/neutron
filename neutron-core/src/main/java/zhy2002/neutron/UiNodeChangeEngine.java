package zhy2002.neutron;

import jsinterop.annotations.JsIgnore;

import javax.validation.constraints.NotNull;

/**
 * Implementor of this interface is responsible for propagation changes in the form of a UiNodeEvent
 * through the UiNode tree.
 */
public interface UiNodeChangeEngine extends UiNodeChangeEngineStatus {

    @JsIgnore
    void processEvent(UiNodeEvent event);

    void beginSession();

    void commitSession();

    void rollbackSession();

    boolean canUndo();

    boolean undo();

    boolean canRedo();

    boolean redo();

    EngineEventModeEnum getEventMode();

    void setEventMode(EngineEventModeEnum mode);

    CycleModeEnum getCycleMode();

    void setCycleMode(@NotNull CycleModeEnum cycleMode);

    /**
     * Finish debounce mode.
     * If is in auto commit state the commit the current changes.
     * Otherwise process the current cycle.
     */
    void flush();

    void queueNotification(UiNodeNotification uiNodeNotification);

}
