package zhy2002.mortgage.interop;

import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;


@JsType(namespace = GLOBAL, name = "GWT")
public class JavaMethods {

    public static int unboxInteger(Integer integer) {
        return integer;
    }

    public static Integer boxInteger(int integer) {
        return integer;
    }
}
