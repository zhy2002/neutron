package zhy2002.neutron.data;

import jsinterop.annotations.JsMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Eliminate type parameter.
 */
public class ValidationErrorList extends ArrayList<ValidationError> {

    //todo make this unmodifiable (should not extend array list).
    public static final ValidationErrorList EMPTY = new ValidationErrorList();

    public ValidationErrorList() {
    }

    public ValidationErrorList(ValidationErrorList list) {
        super(list);
    }

    @JsMethod
    @Override
    public ValidationError get(int index) {
        return super.get(index);
    }

    @JsMethod
    @Override
    public int size() {
        return super.size();
    }
}
