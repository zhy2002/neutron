package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductPackageNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductPackageNameNode extends StringUiNode<ProductFeaturesNode> {

    @Inject
    protected ProductPackageNameNode(@Owner ProductFeaturesNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductPackageNameNode.class;
    }

    protected final ProductPackageNameNodeComponent getComponent() {
        return component;
    }


    private ProductPackageNameNodeComponent component;

    @Inject
    void createComponent(ProductPackageNameNodeComponent.Builder builder) {
        this.component = builder.setProductPackageNameNodeModule(new ProductPackageNameNodeModule(this)).build();
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
