package zhy2002.mortgage.application;

import zhy2002.mortgage.application.gen.node.ApplicationNode;
import zhy2002.mortgage.application.gen.node.ErrorListNode;
import zhy2002.mortgage.application.gen.node.ErrorNode;
import zhy2002.neutron.core.ValidationErrorListAdaptor;
import zhy2002.neutron.core.data.ValidationError;
import zhy2002.neutron.core.di.Owner;

import javax.inject.Inject;

public class LodgementValidationErrorListAdaptor implements ValidationErrorListAdaptor {

    private final ErrorListNode errorListNode;

    @Inject
    public LodgementValidationErrorListAdaptor(@Owner ApplicationNode applicationNode) {
        this.errorListNode = applicationNode.getErrorListNode();
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
