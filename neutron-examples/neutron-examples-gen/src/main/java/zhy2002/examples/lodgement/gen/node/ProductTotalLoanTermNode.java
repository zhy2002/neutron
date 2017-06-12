package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductTotalLoanTermNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductTotalLoanTermNode extends BigDecimalUiNode<ProductDescriptionNode> {

    @Inject
    protected ProductTotalLoanTermNode(@Owner ProductDescriptionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductTotalLoanTermNode.class;
    }

    protected final ProductTotalLoanTermNodeComponent getComponent() {
        return component;
    }


    private ProductTotalLoanTermNodeComponent component;

    @Inject
    void createComponent(ProductTotalLoanTermNodeComponent.Builder builder) {
        this.component = builder.setProductTotalLoanTermNodeModule(new ProductTotalLoanTermNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    public static final PropertyMetadata<UnitSymbol> SUFFIX_SYMBOL_PROPERTY = MetadataRegistry.createProperty(ProductTotalLoanTermNode.class, "suffixSymbol", UnitSymbol.class, ApplicationNodeConstants.YEAR);

    @JsMethod
    public UnitSymbol getSuffixSymbol() {
        return getStateValue(SUFFIX_SYMBOL_PROPERTY);
    }

    @JsMethod
    public void setSuffixSymbol(UnitSymbol value) {
        setStateValue(SUFFIX_SYMBOL_PROPERTY, value);
    }

}
