package zhy2002.neutron.core.interop;

import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;


@JsType(namespace = GLOBAL, name = "GWT")
public class JavaMethods {

    @SuppressWarnings("unusable-by-js")
    public static int unboxInteger(Integer integer) {
        return integer;
    }

    @SuppressWarnings("unusable-by-js")
    public static Integer boxInteger(int integer) {
        return integer;
    }
}
