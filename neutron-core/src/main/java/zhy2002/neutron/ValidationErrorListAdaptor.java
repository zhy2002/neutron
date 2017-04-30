package zhy2002.neutron;

import zhy2002.neutron.data.ValidationError;

/**
 * An interface used to get, add and remove ValidationError
 * from a logic validation error list.
 */
public interface ValidationErrorListAdaptor {

    int getItemCount();

    ValidationError getItem(int index);

    String getItemName(int index);

    void addItem(ValidationError error);

    void removeItem(String itemName);
}
