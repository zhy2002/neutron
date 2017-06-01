package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductsNodeModule.class})
public interface ProductsNodeComponent {

    List<RuleProvider<ProductsNode>> provideRuleProviders();

    ProductListNode createProductListNode();
    ProductCustomerContributionListNode createProductCustomerContributionListNode();
    ProductFeeListNode createProductFeeListNode();
    ProductLoanTypeNode createProductLoanTypeNode();
    SettlementDateNode createSettlementDateNode();
    ProductTotalLoanAmountNode createProductTotalLoanAmountNode();
    ProductTotalSecurityAmountNode createProductTotalSecurityAmountNode();
    ProductTotalLoanLmiAmountNode createProductTotalLoanLmiAmountNode();
    ProductTotalLvrNode createProductTotalLvrNode();
    ProductTotalLvrLmiNode createProductTotalLvrLmiNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductsNodeModule(ProductsNodeModule module);

        ProductsNodeComponent build();
    }

}
