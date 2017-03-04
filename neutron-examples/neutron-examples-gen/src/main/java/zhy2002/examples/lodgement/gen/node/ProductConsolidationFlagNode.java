package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductConsolidationFlagNode extends BooleanUiNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductConsolidationFlagNode.class;
    }

    private ProductConsolidationFlagNodeComponent component;

    @Inject
    void createComponent(ProductConsolidationFlagNodeComponent.Builder builder) {
        this.component = builder.setProductConsolidationFlagNodeModule(new ProductConsolidationFlagNodeModule(this)).build();
    }

    @Override
    protected ProductConsolidationFlagNodeRuleProvider getRuleProvider() {
        return component.getProductConsolidationFlagNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ProductConsolidationFlagNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
