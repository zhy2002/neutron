package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductTotalLvrNode extends BasePercentageNode<ProductsNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductTotalLvrNode.class;
    }

    private ProductTotalLvrNodeComponent component;

    @Inject
    void createComponent(ProductTotalLvrNodeComponent.Builder builder) {
        this.component = builder.setProductTotalLvrNodeModule(new ProductTotalLvrNodeModule(this)).build();
    }

    private ProductTotalLvrNodeRuleProvider getRuleProvider() {
        return component.getProductTotalLvrNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public ProductTotalLvrNode(@NotNull ProductsNode parent, String name) {
        super(parent, name);
    }

}
