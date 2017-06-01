package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductFeeListNode extends ListUiNode<ProductsNode,ProductFeeNode> {

    private ProductFeeListNodeItemFactory itemFactory;
    private ProductFeeListNodeComponent component;

    @Inject
    public ProductFeeListNode(@Owner ProductsNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductFeeListNode.class;
    }

    @Inject
    void receiveNodeProvider(ProductFeeListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Inject
    void createComponent(ProductFeeListNodeComponent.Builder builder) {
        this.component = builder.setProductFeeListNodeModule(new ProductFeeListNodeModule(this)).build();
    }

    private RuleProvider<ProductFeeListNode> getRuleProvider() {
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

    @Override
    public Class<ProductFeeNode> getItemClass() {
        return ProductFeeNode.class;
    }

    @Override
    public NodeAddEvent<ProductFeeNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<ProductFeeNode> createItemRemoveEvent(ProductFeeNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
