package zhy2002.neutron.data;

import jsinterop.annotations.JsType;
import zhy2002.neutron.config.NeutronConstants;

/**
 * Models an option item in a select element.
 * @param <T> concrete type of value.
 */
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SelectOption<?> that = (SelectOption<?>) o;

        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        return text != null ? text.equals(that.text) : that.text == null;
    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }
}
