package zhy2002.mortgage.application.shared;


import zhy2002.mortgage.application.gen.node.ProductNameNode;
import zhy2002.mortgage.application.gen.node.ProductNode;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.rule.AbstractUpdateItemNodeLabelRule;
import zhy2002.neutron.data.StringOption;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.util.ValueUtil;

import javax.inject.Inject;

public class UpdateProductNodeLabelRule extends AbstractUpdateItemNodeLabelRule<ProductNode> {

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
