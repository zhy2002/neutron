package zhy2002.neutron;

import jsinterop.annotations.JsType;

import javax.validation.constraints.NotNull;

/**
 * Implementor of this interface is responsible for propagation changes in the form of a UiNodeEvent
 * through the UiNode tree.
 */
@JsType
public interface UiNodeChangeEngine extends UiNodeChangeEngineStatus {

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

    void flush();

}
