package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ProductDescriptionNodeModule.class})
public interface ProductDescriptionNodeComponent {

    ProductGroupNode createProductGroupNode();
    ProductNameNode createProductNameNode();
    ProductLoanPrimaryPurposeNode createProductLoanPrimaryPurposeNode();
    ProductLendingPurposeNode createProductLendingPurposeNode();
    ProductRequestedAmountNode createProductRequestedAmountNode();
    ProductTotalLoanTermNode createProductTotalLoanTermNode();
    ProductPaymentTypeNode createProductPaymentTypeNode();
    ProductInterestOnlyTermNode createProductInterestOnlyTermNode();
    ProductFixedTermNode createProductFixedTermNode();
    ProductConstructionApplicationFlagNode createProductConstructionApplicationFlagNode();
    ProductCostRecuctionFlagNode createProductCostRecuctionFlagNode();
    ProductConsolidationFlagNode createProductConsolidationFlagNode();
    ProductDissatisfactionFlagNode createProductDissatisfactionFlagNode();
    ProductSpecificFeaturesFlagNode createProductSpecificFeaturesFlagNode();
    ProductAccountHolderListNode createProductAccountHolderListNode();

    RuleProvider<ProductDescriptionNode> getProductDescriptionNodeRuleProvider();
    Map<String, RuleProvider<ProductDescriptionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductDescriptionNodeModule(ProductDescriptionNodeModule module);

        ProductDescriptionNodeComponent build();
    }

}
