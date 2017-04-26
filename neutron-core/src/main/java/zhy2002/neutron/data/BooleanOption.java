package zhy2002.neutron.data;

import jsinterop.annotations.JsType;
import zhy2002.neutron.util.NeutronConstants;

@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public class BooleanOption extends SelectOption<Boolean> {

    public BooleanOption(Boolean value, String text) {
        super(value, text);
    }
}
