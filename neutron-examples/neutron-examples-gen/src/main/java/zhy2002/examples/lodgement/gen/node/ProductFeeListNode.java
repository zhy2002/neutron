package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductFeeListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;
import zhy2002.examples.lodgement.gen.event.*;


public class ProductFeeListNode extends ListUiNode<ProductsNode,ProductFeeNode> {

    @Inject
    protected ProductFeeListNode(@Owner ProductsNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductFeeListNode.class;
    }

    protected final ProductFeeListNodeComponent getComponent() {
        return component;
    }


    private ProductFeeListNodeComponent component;

    @Inject
    void createComponent(ProductFeeListNodeComponent.Builder builder) {
        this.component = builder.setProductFeeListNodeModule(new ProductFeeListNodeModule(this)).build();
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
    public Class<ProductFeeNode> getItemClass() {
        return ProductFeeNode.class;
    }

    @Override
    public NodeAddEvent<ProductFeeNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        ProductFeeNode item = getComponent().createProductFeeNode();
        setNameOfChildBeingCreated(null);
        return new ProductFeeNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<ProductFeeNode> createItemRemoveEvent(ProductFeeNode item) {
        return new ProductFeeNodeRemoveEvent(item);
    }

}
