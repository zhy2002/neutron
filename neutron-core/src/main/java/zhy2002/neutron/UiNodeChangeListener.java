package zhy2002.neutron;

import jsinterop.annotations.JsType;

/**
 * A callback implemented in JS.
 * onUiNodeChanged is called when
 * the state of a node is changed.
 * React component will then extract a state object
 * from the node to decide if re-render is necessary.
 */
@JsType(isNative = true)
@FunctionalInterface
public interface UiNodeChangeListener {

    void onUiNodeChanged();
}
