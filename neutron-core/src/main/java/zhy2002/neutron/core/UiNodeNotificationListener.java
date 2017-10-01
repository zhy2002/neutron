package zhy2002.neutron.core;

import jsinterop.annotations.JsType;

/**
 * Implemented in Js to receive notification from
 * the node hierarchy.
 */
@JsType(isNative = true)
@FunctionalInterface
public interface UiNodeNotificationListener {

    void onNotify(Object parameter);

}
