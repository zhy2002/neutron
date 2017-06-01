package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductGroupNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductGroupNode extends StringUiNode<ProductDescriptionNode> {

    @Inject
    public ProductGroupNode(@Owner ProductDescriptionNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductGroupNode.class;
    }

    protected final ProductGroupNodeComponent getComponent() {
        return component;
    }


    private ProductGroupNodeComponent component;

    @Inject
    void createComponent(ProductGroupNodeComponent.Builder builder) {
        this.component = builder.setProductGroupNodeModule(new ProductGroupNodeModule(this)).build();
    }

    private RuleProvider<ProductGroupNode> getRuleProvider() {
        return component.getProductGroupNodeRuleProvider();
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

    private RuleProvider<ProductGroupNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
