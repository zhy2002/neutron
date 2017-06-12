package zhy2002.examples.lodgement.shared;


import zhy2002.examples.lodgement.gen.node.ProductNameNode;
import zhy2002.examples.lodgement.gen.node.ProductNode;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.UpdateItemNodeLabelRule;
import zhy2002.neutron.data.StringOption;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.util.ValueUtil;

import javax.inject.Inject;

public class UpdateProductNodeLabelRule extends UpdateItemNodeLabelRule<ProductNode> {

    @Inject
    public UpdateProductNodeLabelRule(@Owner ProductNode owner) {
        super(owner);
    }

    public ProductNameNode getProductNameNode() {
        if (getOwner().getProductDescriptionNode() != null) {
            return getOwner().getProductDescriptionNode().getProductNameNode();
        }
        return null;
    }

    @Override
    protected boolean filter(UiNodeEvent event) {
        return event.getOrigin() == getProductNameNode();
    }

    @Override
    protected void updateLabel(UiNodeEvent event) {
        String value = null;
        ProductNameNode productNameNode = getProductNameNode();
        if (productNameNode != null) {
            value = productNameNode.getValue();
        }

        if (ValueUtil.isEmpty(value)) {
            value = "[Product " + (Integer.parseInt(getOwner().getName()) + 1) + "]";
        } else {
            StringOption[] options = productNameNode.getOptions();
            value = ValueUtil.getText(options, value);
        }

        getOwner().setNodeLabel(value);
    }
}
