package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductPackageNameNode extends StringUiNode<ProductFeaturesNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductPackageNameNode.class;
    }

    private ProductPackageNameNodeComponent component;

    @Inject
    void createComponent(ProductPackageNameNodeComponent.Builder builder) {
        this.component = builder.setProductPackageNameNodeModule(new ProductPackageNameNodeModule(this)).build();
    }

    private ProductPackageNameNodeRuleProvider getRuleProvider() {
        return component.getProductPackageNameNodeRuleProvider();
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

    private RuleProvider<ProductPackageNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public ProductPackageNameNode(@NotNull ProductFeaturesNode parent, String name) {
        super(parent, name);
    }

}
