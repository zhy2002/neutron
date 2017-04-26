package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductListNode extends ListUiNode<ProductsNode,ProductNode> {

    private ProductListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(ProductListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ProductListNode.class;
    }

    private ProductListNodeComponent component;

    @Inject
    void createComponent(ProductListNodeComponent.Builder builder) {
        this.component = builder.setProductListNodeModule(new ProductListNodeModule(this)).build();
    }

    private RuleProvider<ProductListNode> getRuleProvider() {
        return component.getProductListNodeRuleProvider();
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

    private RuleProvider<ProductListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public ProductListNode(@NotNull ProductsNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<ProductNode> getItemClass() {
        return ProductNode.class;
    }

    @Override
    public NodeAddEvent<ProductNode> createItemAddEvent(String name) {
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<ProductNode> createItemRemoveEvent(ProductNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
