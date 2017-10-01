package zhy2002.neutron.core.exception;

import jsinterop.annotations.JsConstructor;

/**
 * The base exception which is thrown during change engine execution.
 */
public class UiNodeEventException extends UiNodeException {

    public UiNodeEventException() {
        this("Unknown Change Engine Error");
    }

    @JsConstructor
    public UiNodeEventException(String msg) {
        super(msg);
    }
}
