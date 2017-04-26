package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductFixedTermNode extends BigDecimalUiNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductFixedTermNode.class;
    }

    private ProductFixedTermNodeComponent component;

    @Inject
    void createComponent(ProductFixedTermNodeComponent.Builder builder) {
        this.component = builder.setProductFixedTermNodeModule(new ProductFixedTermNodeModule(this)).build();
    }

    private RuleProvider<ProductFixedTermNode> getRuleProvider() {
        return component.getProductFixedTermNodeRuleProvider();
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

    private RuleProvider<ProductFixedTermNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public ProductFixedTermNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
