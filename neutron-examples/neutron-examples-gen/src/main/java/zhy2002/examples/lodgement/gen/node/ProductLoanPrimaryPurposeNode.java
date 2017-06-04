package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductLoanPrimaryPurposeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductLoanPrimaryPurposeNode extends StringUiNode<ProductDescriptionNode> {

    @Inject
    protected ProductLoanPrimaryPurposeNode(@Owner ProductDescriptionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductLoanPrimaryPurposeNode.class;
    }

    protected final ProductLoanPrimaryPurposeNodeComponent getComponent() {
        return component;
    }


    private ProductLoanPrimaryPurposeNodeComponent component;

    @Inject
    void createComponent(ProductLoanPrimaryPurposeNodeComponent.Builder builder) {
        this.component = builder.setProductLoanPrimaryPurposeNodeModule(new ProductLoanPrimaryPurposeNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
