package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductLoanTypeNode extends StringUiNode<ProductsNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductLoanTypeNode.class;
    }

    private ProductLoanTypeNodeComponent component;

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


    public ProductLoanTypeNode(@NotNull ProductsNode parent, String name) {
        super(parent, name);
    }

}
