package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductRepaymentFrequencyNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductRepaymentFrequencyNode extends StringUiNode<ProductFeaturesNode> {

    @Inject
    protected ProductRepaymentFrequencyNode(@Owner ProductFeaturesNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductRepaymentFrequencyNode.class;
    }

    protected final ProductRepaymentFrequencyNodeComponent getComponent() {
        return component;
    }


    private ProductRepaymentFrequencyNodeComponent component;

    @Inject
    void createComponent(ProductRepaymentFrequencyNodeComponent.Builder builder) {
        this.component = builder.setProductRepaymentFrequencyNodeModule(new ProductRepaymentFrequencyNodeModule(this)).build();
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
