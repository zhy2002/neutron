package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductInterestOnlyTermNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductInterestOnlyTermNode extends BigDecimalUiNode<ProductDescriptionNode> {

    @Inject
    public ProductInterestOnlyTermNode(@Owner ProductDescriptionNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductInterestOnlyTermNode.class;
    }

    protected final ProductInterestOnlyTermNodeComponent getComponent() {
        return component;
    }


    private ProductInterestOnlyTermNodeComponent component;

    @Inject
    void createComponent(ProductInterestOnlyTermNodeComponent.Builder builder) {
        this.component = builder.setProductInterestOnlyTermNodeModule(new ProductInterestOnlyTermNodeModule(this)).build();
    }

    private RuleProvider<ProductInterestOnlyTermNode> getRuleProvider() {
        return component.getProductInterestOnlyTermNodeRuleProvider();
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

    private RuleProvider<ProductInterestOnlyTermNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
