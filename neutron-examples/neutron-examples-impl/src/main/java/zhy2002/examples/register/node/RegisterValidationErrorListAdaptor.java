package zhy2002.examples.register.node;

import zhy2002.examples.register.gen.node.ErrorListNode;
import zhy2002.examples.register.gen.node.ErrorNode;
import zhy2002.examples.register.gen.node.RegisterNode;
import zhy2002.neutron.ValidationErrorListAdaptor;
import zhy2002.neutron.data.ValidationError;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;

public class RegisterValidationErrorListAdaptor implements ValidationErrorListAdaptor {

    private final ErrorListNode errorListNode;

    @Inject
    public RegisterValidationErrorListAdaptor(@Owner RegisterNode registerNode) {
        errorListNode = registerNode.getErrorListNode();
    }

    @Override
    public int getItemCount() {
        return errorListNode.getItemCount();
    }

    @Override
    public ValidationError getItem(int index) {
        return errorListNode.getItem(index).getValue();
    }

    @Override
    public String getItemName(int index) {
        return errorListNode.getItem(index).getName();
    }

    @Override
    public void addItem(ValidationError error) {
        ErrorNode errorNode = errorListNode.createItem();
        errorNode.setValue(error);
        error.setErrorNode(errorNode);
    }

    @Override
    public void removeItem(String itemName) {
        errorListNode.removeByName(itemName);
    }
}
