package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductCustomerContributionListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductCustomerContributionListNode extends ListUiNode<ProductsNode,ProductCustomerContributionNode> {

    @Inject
    public ProductCustomerContributionListNode(@Owner ProductsNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductCustomerContributionListNode.class;
    }

    private ProductCustomerContributionListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(ProductCustomerContributionListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    protected final ProductCustomerContributionListNodeComponent getComponent() {
        return component;
    }


    private ProductCustomerContributionListNodeComponent component;

    @Inject
    void createComponent(ProductCustomerContributionListNodeComponent.Builder builder) {
        this.component = builder.setProductCustomerContributionListNodeModule(new ProductCustomerContributionListNodeModule(this)).build();
    }

    private RuleProvider<ProductCustomerContributionListNode> getRuleProvider() {
        return component.getProductCustomerContributionListNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<ProductCustomerContributionListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @Override
    public Class<ProductCustomerContributionNode> getItemClass() {
        return ProductCustomerContributionNode.class;
    }

    @Override
    public NodeAddEvent<ProductCustomerContributionNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<ProductCustomerContributionNode> createItemRemoveEvent(ProductCustomerContributionNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
