package zhy2002.neutron;

import java.util.ArrayList;

/**
 * Eliminate type parameter.
 */
public class ValidationErrorList extends ArrayList<ValidationError> {
    public ValidationErrorList() {
    }

    public ValidationErrorList(ValidationErrorList list) {
        super(list);
    }
}
