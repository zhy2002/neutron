package zhy2002.neutron.data;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;


@JsType
public class SelectOption {

    private final String value;
    private final String text;

    @JsIgnore
    public SelectOption(String value) {
        this(value, value);
    }

    public SelectOption(String value, String text) {
        this.value = value;
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
