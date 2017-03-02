package zhy2002.examples.register.data;

import jsinterop.annotations.JsType;

@JsType
public class ProductPlan {

    private String text;
    private String value;

    public ProductPlan(String text, String value) {
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
