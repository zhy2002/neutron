package zhy2002.neutron.data;


import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import zhy2002.neutron.util.NeutronConstants;

import java.util.ArrayList;
import java.util.List;

@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public class StringOption extends SelectOption<String> {

    @JsIgnore
    public StringOption(String value) {
        this(value, value);
    }

    public StringOption(String value, String text) {
        super(value, text);
    }
}
