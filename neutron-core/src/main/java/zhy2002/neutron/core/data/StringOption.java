package zhy2002.neutron.core.data;

import jsinterop.annotations.JsIgnore;

public class StringOption extends SelectOption<String> {

    @JsIgnore
    public StringOption(String value) {
        this(value, value);
    }

    public StringOption(String value, String text) {
        super(value, text);
    }
}
