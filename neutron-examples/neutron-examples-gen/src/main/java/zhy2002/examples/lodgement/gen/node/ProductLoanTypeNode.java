package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductLoanTypeNode extends StringUiNode<ProductsNode> {

    private ProductLoanTypeNodeComponent component;

    @Inject
    public ProductLoanTypeNode(@Owner ProductsNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductLoanTypeNode.class;
    }

    @Inject
    void createComponent(ProductLoanTypeNodeComponent.Builder builder) {
        this.component = builder.setProductLoanTypeNodeModule(new ProductLoanTypeNodeModule(this)).build();
    }

    private RuleProvider<ProductLoanTypeNode> getRuleProvider() {
        return component.getProductLoanTypeNodeRuleProvider();
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

    private RuleProvider<ProductLoanTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
