package zhy2002.examples.lodgement.nab.node;

import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.examples.lodgement.gen.node.ErrorListNode;
import zhy2002.examples.lodgement.gen.node.ErrorNode;
import zhy2002.neutron.ValidationErrorListAdaptor;
import zhy2002.neutron.data.ValidationError;
import zhy2002.neutron.di.Owner;

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
