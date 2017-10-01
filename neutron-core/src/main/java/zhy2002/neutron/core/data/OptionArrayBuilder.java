package zhy2002.neutron.core.data;

import jsinterop.annotations.JsType;
import zhy2002.neutron.core.config.NeutronConstants;
import zhy2002.neutron.core.util.ValueUtil;

import java.util.ArrayList;
import java.util.List;

@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public class OptionArrayBuilder {
    private final List<Object> values = new ArrayList<>();
    private final List<String> labels = new ArrayList<>();

    public OptionArrayBuilder() {
    }

    public OptionArrayBuilder addItem(Object value, String text) {
        values.add(value);
        labels.add(text);
        return this;
    }

    public StringOption[] toStringOptionArray() {
        StringOption[] options = new StringOption[values.size()];
        for (int i = 0; i < options.length; i++) {
            options[i] = new StringOption(values.get(i).toString(), labels.get(i));
        }
        return options;
    }

    public BooleanOption[] toBooleanOptionArray() {
        BooleanOption[] options = new BooleanOption[values.size()];
        for (int i = 0; i < options.length; i++) {
            options[i] = new BooleanOption(ValueUtil.convertToBoolean(values.get(i)), labels.get(i));
        }
        return options;
    }
}

