package zhy2002.examples.register;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;

@JsType
public class AustralianState {

    private final String text;
    private final String value;

    @JsIgnore
    AustralianState(String text, String value) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public String getValue() {
        return value;
    }
}
