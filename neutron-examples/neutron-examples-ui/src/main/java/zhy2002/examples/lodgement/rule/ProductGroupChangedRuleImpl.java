package zhy2002.examples.lodgement.rule;


import zhy2002.examples.lodgement.data.ApplicationNodeConstants;
import zhy2002.examples.lodgement.gen.node.ProductGroupNode;
import zhy2002.examples.lodgement.gen.node.ProductNameNode;
import zhy2002.examples.lodgement.gen.rule.ProductGroupChangedRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.RefreshEventBinding;
import zhy2002.neutron.data.StringOption;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;

public class ProductGroupChangedRuleImpl extends ProductGroupChangedRule {

    @Inject
    public ProductGroupChangedRuleImpl(@Owner ProductGroupNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new StringStateChangeEventBinding(
                        (e) -> onChange()
                ),
                new RefreshEventBinding(
                        (e) -> onChange(),
                        NeutronEventSubjects.NODE_LOADED_REFRESH_REASON
                )
        );
    }

    private ProductNameNode getProductNameNode() {
        return getOwner().getParent().getProductNameNode();
    }

    private void onChange() {
        String group = getProductGroupNode().getValue();
        StringOption[] productList = ApplicationNodeConstants.NAB_PRODUCT_NAME_MAP.get(group);
        ProductNameNode productNameNode = getProductNameNode();
        if (productList == null) {
            productList = ApplicationNodeConstants.NAB_PRODUCT_NAME;
        }

        if (!Arrays.equals(productList, productNameNode.getOptions())) {
            productNameNode.setOptions(productList);
            productNameNode.setValue("");
        }

    }
}
