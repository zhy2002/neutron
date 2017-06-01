package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductTotalLvrLmiNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductTotalLvrLmiNode extends BasePercentageNode<ProductsNode> {

    @Inject
    public ProductTotalLvrLmiNode(@Owner ProductsNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductTotalLvrLmiNode.class;
    }

    protected final ProductTotalLvrLmiNodeComponent getComponent() {
        return component;
    }


    private ProductTotalLvrLmiNodeComponent component;

    @Inject
    void createComponent(ProductTotalLvrLmiNodeComponent.Builder builder) {
        this.component = builder.setProductTotalLvrLmiNodeModule(new ProductTotalLvrLmiNodeModule(this)).build();
    }

    private RuleProvider<ProductTotalLvrLmiNode> getRuleProvider() {
        return component.getProductTotalLvrLmiNodeRuleProvider();
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

    private RuleProvider<ProductTotalLvrLmiNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
