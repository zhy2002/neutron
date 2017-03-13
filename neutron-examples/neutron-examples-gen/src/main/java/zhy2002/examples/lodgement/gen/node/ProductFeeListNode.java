package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductFeeListNode extends ListUiNode<ProductsNode,ProductFeeNode> {

    private ProductFeeListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(ProductFeeListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ProductFeeListNode.class;
    }

    private ProductFeeListNodeComponent component;

    @Inject
    void createComponent(ProductFeeListNodeComponent.Builder builder) {
        this.component = builder.setProductFeeListNodeModule(new ProductFeeListNodeModule(this)).build();
    }

    private ProductFeeListNodeRuleProvider getRuleProvider() {
        return component.getProductFeeListNodeRuleProvider();
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

    private RuleProvider<ProductFeeListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public ProductFeeListNode(@NotNull ProductsNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<ProductFeeNode> getItemClass() {
        return ProductFeeNode.class;
    }

    public NodeAddEvent<ProductFeeNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<ProductFeeNode> createItemRemoveEvent(ProductFeeNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
