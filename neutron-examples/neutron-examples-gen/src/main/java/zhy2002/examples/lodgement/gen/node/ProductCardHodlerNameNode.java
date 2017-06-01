package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductCardHodlerNameNode extends StringUiNode<ProductCardHolderNode> {

    private ProductCardHodlerNameNodeComponent component;

    @Inject
    public ProductCardHodlerNameNode(@Owner ProductCardHolderNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductCardHodlerNameNode.class;
    }

    @Inject
    void createComponent(ProductCardHodlerNameNodeComponent.Builder builder) {
        this.component = builder.setProductCardHodlerNameNodeModule(new ProductCardHodlerNameNodeModule(this)).build();
    }

    private RuleProvider<ProductCardHodlerNameNode> getRuleProvider() {
        return component.getProductCardHodlerNameNodeRuleProvider();
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

    private RuleProvider<ProductCardHodlerNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
