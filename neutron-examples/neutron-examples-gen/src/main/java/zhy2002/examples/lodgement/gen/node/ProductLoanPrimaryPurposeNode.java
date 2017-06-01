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
    public ProductLoanPrimaryPurposeNode(@Owner ProductDescriptionNode parent, @ChildName String name) {
        super(parent, name);
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

    private RuleProvider<ProductLoanPrimaryPurposeNode> getRuleProvider() {
        return component.getProductLoanPrimaryPurposeNodeRuleProvider();
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

    private RuleProvider<ProductLoanPrimaryPurposeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
