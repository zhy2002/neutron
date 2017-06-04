package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductLendingPurposeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductLendingPurposeNode extends StringUiNode<ProductDescriptionNode> {

    @Inject
    protected ProductLendingPurposeNode(@Owner ProductDescriptionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductLendingPurposeNode.class;
    }

    protected final ProductLendingPurposeNodeComponent getComponent() {
        return component;
    }


    private ProductLendingPurposeNodeComponent component;

    @Inject
    void createComponent(ProductLendingPurposeNodeComponent.Builder builder) {
        this.component = builder.setProductLendingPurposeNodeModule(new ProductLendingPurposeNodeModule(this)).build();
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
