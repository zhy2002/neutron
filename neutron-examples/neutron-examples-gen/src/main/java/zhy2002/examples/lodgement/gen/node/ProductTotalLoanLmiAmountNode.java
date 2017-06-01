package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductTotalLoanLmiAmountNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductTotalLoanLmiAmountNode extends BaseCurrencyNode<ProductsNode> {

    @Inject
    public ProductTotalLoanLmiAmountNode(@Owner ProductsNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductTotalLoanLmiAmountNode.class;
    }

    protected final ProductTotalLoanLmiAmountNodeComponent getComponent() {
        return component;
    }


    private ProductTotalLoanLmiAmountNodeComponent component;

    @Inject
    void createComponent(ProductTotalLoanLmiAmountNodeComponent.Builder builder) {
        this.component = builder.setProductTotalLoanLmiAmountNodeModule(new ProductTotalLoanLmiAmountNodeModule(this)).build();
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
