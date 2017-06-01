package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductLendingPurposeNode extends StringUiNode<ProductDescriptionNode> {

    private ProductLendingPurposeNodeComponent component;

    @Inject
    public ProductLendingPurposeNode(@Owner ProductDescriptionNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductLendingPurposeNode.class;
    }

    @Inject
    void createComponent(ProductLendingPurposeNodeComponent.Builder builder) {
        this.component = builder.setProductLendingPurposeNodeModule(new ProductLendingPurposeNodeModule(this)).build();
    }

    private RuleProvider<ProductLendingPurposeNode> getRuleProvider() {
        return component.getProductLendingPurposeNodeRuleProvider();
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

    private RuleProvider<ProductLendingPurposeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
