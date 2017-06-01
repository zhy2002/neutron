package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductConstructionApplicationFlagNode extends BooleanUiNode<ProductDescriptionNode> {

    private ProductConstructionApplicationFlagNodeComponent component;

    @Inject
    public ProductConstructionApplicationFlagNode(@Owner ProductDescriptionNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductConstructionApplicationFlagNode.class;
    }

    @Inject
    void createComponent(ProductConstructionApplicationFlagNodeComponent.Builder builder) {
        this.component = builder.setProductConstructionApplicationFlagNodeModule(new ProductConstructionApplicationFlagNodeModule(this)).build();
    }

    private RuleProvider<ProductConstructionApplicationFlagNode> getRuleProvider() {
        return component.getProductConstructionApplicationFlagNodeRuleProvider();
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

    private RuleProvider<ProductConstructionApplicationFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
