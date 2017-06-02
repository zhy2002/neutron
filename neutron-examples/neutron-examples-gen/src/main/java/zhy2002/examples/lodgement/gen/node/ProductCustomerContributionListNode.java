package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductCustomerContributionListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;
import zhy2002.examples.lodgement.gen.event.*;


public class ProductCustomerContributionListNode extends ListUiNode<ProductsNode,ProductCustomerContributionNode> {

    @Inject
    protected ProductCustomerContributionListNode(@Owner ProductsNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductCustomerContributionListNode.class;
    }

    protected final ProductCustomerContributionListNodeComponent getComponent() {
        return component;
    }


    private ProductCustomerContributionListNodeComponent component;

    @Inject
    void createComponent(ProductCustomerContributionListNodeComponent.Builder builder) {
        this.component = builder.setProductCustomerContributionListNodeModule(new ProductCustomerContributionListNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    @Override
    public Class<ProductCustomerContributionNode> getItemClass() {
        return ProductCustomerContributionNode.class;
    }

    @Override
    public NodeAddEvent<ProductCustomerContributionNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        ProductCustomerContributionNode item = getComponent().createProductCustomerContributionNode();
        setNameOfChildBeingCreated(null);
        return new ProductCustomerContributionNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<ProductCustomerContributionNode> createItemRemoveEvent(ProductCustomerContributionNode item) {
        return new ProductCustomerContributionNodeRemoveEvent(item);
    }

}
