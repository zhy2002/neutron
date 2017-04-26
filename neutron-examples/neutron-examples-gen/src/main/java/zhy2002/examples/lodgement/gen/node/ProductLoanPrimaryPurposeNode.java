package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductLoanPrimaryPurposeNode extends StringUiNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductLoanPrimaryPurposeNode.class;
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


    public ProductLoanPrimaryPurposeNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
