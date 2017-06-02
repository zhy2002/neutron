package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductRewardsMembershipNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductRewardsMembershipNode extends StringUiNode<ProductCardHolderNode> {

    @Inject
    protected ProductRewardsMembershipNode(@Owner ProductCardHolderNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductRewardsMembershipNode.class;
    }

    protected final ProductRewardsMembershipNodeComponent getComponent() {
        return component;
    }


    private ProductRewardsMembershipNodeComponent component;

    @Inject
    void createComponent(ProductRewardsMembershipNodeComponent.Builder builder) {
        this.component = builder.setProductRewardsMembershipNodeModule(new ProductRewardsMembershipNodeModule(this)).build();
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
