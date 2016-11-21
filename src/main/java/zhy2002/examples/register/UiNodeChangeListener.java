package zhy2002.examples.register;

import jsinterop.annotations.JsType;

/**
 * Defines a callback for when the ui node changes.
 */
@JsType(isNative = true)
@FunctionalInterface
public interface UiNodeChangeListener {

    void onUiNodeChanged();
}
