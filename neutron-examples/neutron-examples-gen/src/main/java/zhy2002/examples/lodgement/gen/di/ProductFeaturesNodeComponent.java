package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductFeaturesNodeModule.class})
public interface ProductFeaturesNodeComponent {

    List<RuleProvider<ProductFeaturesNode>> provideRuleProviders();

    ProductPackageNameNode createProductPackageNameNode();
    ProductRepaymentFrequencyNode createProductRepaymentFrequencyNode();
    ProductRateLockFlagNode createProductRateLockFlagNode();
    ProductTransactionAccountFlagNode createProductTransactionAccountFlagNode();
    TransactionAccountOptOutReasonNode createTransactionAccountOptOutReasonNode();
    Product100PercentOffsetFlagNode createProduct100PercentOffsetFlagNode();
    ProductCreditCardFlagNode createProductCreditCardFlagNode();
    CreditCardOptOutReasonNode createCreditCardOptOutReasonNode();
    ProductCreditCardTypeNode createProductCreditCardTypeNode();
    ProductCreditCardLimitNode createProductCreditCardLimitNode();
    ProductExpressConsentFlagNode createProductExpressConsentFlagNode();
    ProductCardHolderNode createProductCardHolderNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductFeaturesNodeModule(ProductFeaturesNodeModule module);

        ProductFeaturesNodeComponent build();
    }

}
