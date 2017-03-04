package zhy2002.neutron.data;

import jsinterop.annotations.JsType;
import zhy2002.neutron.util.NeutronConstants;

@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public class SelectOption<T> {

    private final T value;
    private final String text;

    public SelectOption(T value, String text) {
        this.value = value;
        this.text = text;
    }

    public T getValue() {
        return value;
    }

    /**
     * Used to display this option.
     *
     * @return Unique text within the containing collection.
     */
    public String getText() {
        return text;
    }
}
