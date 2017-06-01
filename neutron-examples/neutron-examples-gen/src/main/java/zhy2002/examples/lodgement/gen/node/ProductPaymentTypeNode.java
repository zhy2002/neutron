package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductPaymentTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductPaymentTypeNode extends StringUiNode<ProductDescriptionNode> {

    @Inject
    public ProductPaymentTypeNode(@Owner ProductDescriptionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductPaymentTypeNode.class;
    }

    protected final ProductPaymentTypeNodeComponent getComponent() {
        return component;
    }


    private ProductPaymentTypeNodeComponent component;

    @Inject
    void createComponent(ProductPaymentTypeNodeComponent.Builder builder) {
        this.component = builder.setProductPaymentTypeNodeModule(new ProductPaymentTypeNodeModule(this)).build();
    }

    private RuleProvider<ProductPaymentTypeNode> getRuleProvider() {
        return component.getProductPaymentTypeNodeRuleProvider();
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

    private RuleProvider<ProductPaymentTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
