package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;
import zhy2002.examples.lodgement.gen.event.*;


public class ProductListNode extends ListUiNode<ProductsNode,ProductNode> {

    @Inject
    protected ProductListNode(@Owner ProductsNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductListNode.class;
    }

    protected final ProductListNodeComponent getComponent() {
        return component;
    }


    private ProductListNodeComponent component;

    @Inject
    void createComponent(ProductListNodeComponent.Builder builder) {
        this.component = builder.setProductListNodeModule(new ProductListNodeModule(this)).build();
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
    public Class<ProductNode> getItemClass() {
        return ProductNode.class;
    }

    @Override
    public NodeAddEvent<ProductNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        ProductNode item = getComponent().createProductNode();
        setNameOfChildBeingCreated(null);
        return new ProductNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<ProductNode> createItemRemoveEvent(ProductNode item) {
        return new ProductNodeRemoveEvent(item);
    }

}
