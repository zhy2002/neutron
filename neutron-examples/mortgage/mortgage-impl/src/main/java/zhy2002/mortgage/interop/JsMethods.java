package zhy2002.mortgage.interop;

import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

/**
 * This class contains global functions used for Java/JS interop.
 */
@JsType(namespace = GLOBAL, name = "window", isNative = true)
public class JsMethods {

    public static native void startLodgement();

}

