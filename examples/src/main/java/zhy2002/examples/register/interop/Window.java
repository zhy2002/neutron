package zhy2002.examples.register.interop;

import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

@JsType(namespace = GLOBAL, name = "window", isNative = true)
public class Window {
    public static native void startRegister();
}
