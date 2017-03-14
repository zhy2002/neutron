package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductCustomerContributionListNode extends ListUiNode<ProductsNode,ProductCustomerContributionNode> {

    private ProductCustomerContributionListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(ProductCustomerContributionListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ProductCustomerContributionListNode.class;
    }

    private ProductCustomerContributionListNodeComponent component;

    @Inject
    void createComponent(ProductCustomerContributionListNodeComponent.Builder builder) {
        this.component = builder.setProductCustomerContributionListNodeModule(new ProductCustomerContributionListNodeModule(this)).build();
    }

    private ProductCustomerContributionListNodeRuleProvider getRuleProvider() {
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

    public ProductCustomerContributionListNode(@NotNull ProductsNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<ProductCustomerContributionNode> getItemClass() {
        return ProductCustomerContributionNode.class;
    }

    public NodeAddEvent<ProductCustomerContributionNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<ProductCustomerContributionNode> createItemRemoveEvent(ProductCustomerContributionNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}