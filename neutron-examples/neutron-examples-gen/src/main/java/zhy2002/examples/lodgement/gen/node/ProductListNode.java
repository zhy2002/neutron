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

    private ProductListNodeRuleProvider getRuleProvider() {
        return component.getProductListNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public ProductListNode(@NotNull ProductsNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<ProductNode> getItemClass() {
        return ProductNode.class;
    }

    public NodeAddEvent<ProductNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<ProductNode> createItemRemoveEvent(ProductNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
