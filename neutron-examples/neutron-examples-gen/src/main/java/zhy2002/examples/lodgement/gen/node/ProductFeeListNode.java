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
    public ProductFeeListNode(@Owner ProductsNode parent, @ChildName String name) {
        super(parent, name);
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
        getContext().setNameOfNodeBeingCreated(name);
        ProductFeeNode item = getComponent().createProductFeeNode();
        getContext().setNameOfNodeBeingCreated(null);
        return new ProductFeeNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<ProductFeeNode> createItemRemoveEvent(ProductFeeNode item) {
        return new ProductFeeNodeRemoveEvent(item);
    }

}
