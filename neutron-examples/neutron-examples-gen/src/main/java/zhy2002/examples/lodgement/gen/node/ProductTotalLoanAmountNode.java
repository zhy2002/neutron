package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductTotalLoanAmountNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductTotalLoanAmountNode extends BaseCurrencyNode<ProductsNode> {

    @Inject
    public ProductTotalLoanAmountNode(@Owner ProductsNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductTotalLoanAmountNode.class;
    }

    protected final ProductTotalLoanAmountNodeComponent getComponent() {
        return component;
    }


    private ProductTotalLoanAmountNodeComponent component;

    @Inject
    void createComponent(ProductTotalLoanAmountNodeComponent.Builder builder) {
        this.component = builder.setProductTotalLoanAmountNodeModule(new ProductTotalLoanAmountNodeModule(this)).build();
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
