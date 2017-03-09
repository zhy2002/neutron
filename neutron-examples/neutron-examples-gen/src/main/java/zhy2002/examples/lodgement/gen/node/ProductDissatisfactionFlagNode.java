package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductDissatisfactionFlagNode extends BooleanUiNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductDissatisfactionFlagNode.class;
    }

    private ProductDissatisfactionFlagNodeComponent component;

    @Inject
    void createComponent(ProductDissatisfactionFlagNodeComponent.Builder builder) {
        this.component = builder.setProductDissatisfactionFlagNodeModule(new ProductDissatisfactionFlagNodeModule(this)).build();
    }

    private ProductDissatisfactionFlagNodeRuleProvider getRuleProvider() {
        return component.getProductDissatisfactionFlagNodeRuleProvider();
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

    private RuleProvider<ProductDissatisfactionFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public ProductDissatisfactionFlagNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
