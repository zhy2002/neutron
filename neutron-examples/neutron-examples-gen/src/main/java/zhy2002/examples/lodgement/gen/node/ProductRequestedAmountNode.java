package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductRequestedAmountNode extends BaseCurrencyNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductRequestedAmountNode.class;
    }

    private ProductRequestedAmountNodeComponent component;

    @Inject
    void createComponent(ProductRequestedAmountNodeComponent.Builder builder) {
        this.component = builder.setProductRequestedAmountNodeModule(new ProductRequestedAmountNodeModule(this)).build();
    }

    private ProductRequestedAmountNodeRuleProvider getRuleProvider() {
        return component.getProductRequestedAmountNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public ProductRequestedAmountNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
