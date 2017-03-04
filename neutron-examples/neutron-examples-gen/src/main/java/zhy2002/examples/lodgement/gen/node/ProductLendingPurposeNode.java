package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductLendingPurposeNode extends StringUiNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductLendingPurposeNode.class;
    }

    private ProductLendingPurposeNodeComponent component;

    @Inject
    void createComponent(ProductLendingPurposeNodeComponent.Builder builder) {
        this.component = builder.setProductLendingPurposeNodeModule(new ProductLendingPurposeNodeModule(this)).build();
    }

    @Override
    protected ProductLendingPurposeNodeRuleProvider getRuleProvider() {
        return component.getProductLendingPurposeNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ProductLendingPurposeNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
