package zhy2002.neutron.data;

import jsinterop.annotations.JsType;
import zhy2002.neutron.config.NeutronConstants;

import java.util.ArrayList;
import java.util.List;

@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public class StringOptionArrayBuilder {
    private final List<StringOption> list = new ArrayList<>();

    public StringOptionArrayBuilder() {}

    public void addItem(String value, String text) {
        list.add(new StringOption(value, text));
    }

    public StringOption[] toArray() {
        return list.toArray(new StringOption[list.size()]);
    }
}

