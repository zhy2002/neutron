package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ProductFeaturesNodeModule.class})
public interface ProductFeaturesNodeComponent {

    ProductPackageNameNode createProductPackageNameNode();
    ProductRepaymentFrequencyNode createProductRepaymentFrequencyNode();
    ProductRateLockFlagNode createProductRateLockFlagNode();
    ProductTransactionAccountFlagNode createProductTransactionAccountFlagNode();
    ProductOptOutReasonNode createProductOptOutReasonNode();
    ProductCreditCardFlagNode createProductCreditCardFlagNode();
    ProductCreditCardTypeNode createProductCreditCardTypeNode();
    ProductCreditCardLimitNode createProductCreditCardLimitNode();
    ProductExpressConsentFlagNode createProductExpressConsentFlagNode();
    Product100PercentOffsetFlagNode createProduct100PercentOffsetFlagNode();
    ProductCardHolderNode createProductPrimaryCardHolderNode();
    ProductCardHolderNode createProductAdditionalCardHolderNode();

    RuleProvider<ProductFeaturesNode> getProductFeaturesNodeRuleProvider();
    Map<String, RuleProvider<ProductFeaturesNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductFeaturesNodeModule(ProductFeaturesNodeModule module);

        ProductFeaturesNodeComponent build();
    }

}
