package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductOptOutReasonNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductOptOutReasonNode extends StringUiNode<ProductFeaturesNode> {

    @Inject
    public ProductOptOutReasonNode(@Owner ProductFeaturesNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductOptOutReasonNode.class;
    }

    protected final ProductOptOutReasonNodeComponent getComponent() {
        return component;
    }


    private ProductOptOutReasonNodeComponent component;

    @Inject
    void createComponent(ProductOptOutReasonNodeComponent.Builder builder) {
        this.component = builder.setProductOptOutReasonNodeModule(new ProductOptOutReasonNodeModule(this)).build();
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
