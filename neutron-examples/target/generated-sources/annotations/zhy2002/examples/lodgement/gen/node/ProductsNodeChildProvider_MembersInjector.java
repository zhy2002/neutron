package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductsNodeChildProvider_MembersInjector
    implements MembersInjector<ProductsNodeChildProvider> {
  private final MembersInjector<SettlementDateNode> settlementDateNodeInjectorMembersInjector;

  private final MembersInjector<ProductTotalSecurityAmountNode>
      productTotalSecurityAmountNodeInjectorMembersInjector;

  private final MembersInjector<ProductLoanTypeNode> productLoanTypeNodeInjectorMembersInjector;

  private final MembersInjector<ProductTotalLoanAmountNode>
      productTotalLoanAmountNodeInjectorMembersInjector;

  private final MembersInjector<ProductTotalLvrLmiNode>
      productTotalLvrLmiNodeInjectorMembersInjector;

  private final MembersInjector<ProductCustomerContributionNode>
      productCustomerContributionNodeInjectorMembersInjector;

  private final MembersInjector<ProductListNode> productListNodeInjectorMembersInjector;

  private final MembersInjector<ProductTotalLoanLmiAmountNode>
      productTotalLoanLmiAmountNodeInjectorMembersInjector;

  private final MembersInjector<ProductFeesNode> productFeesNodeInjectorMembersInjector;

  private final MembersInjector<ProductTotalLvrNode> productTotalLvrNodeInjectorMembersInjector;

  public ProductsNodeChildProvider_MembersInjector(
      MembersInjector<SettlementDateNode> settlementDateNodeInjectorMembersInjector,
      MembersInjector<ProductTotalSecurityAmountNode>
          productTotalSecurityAmountNodeInjectorMembersInjector,
      MembersInjector<ProductLoanTypeNode> productLoanTypeNodeInjectorMembersInjector,
      MembersInjector<ProductTotalLoanAmountNode> productTotalLoanAmountNodeInjectorMembersInjector,
      MembersInjector<ProductTotalLvrLmiNode> productTotalLvrLmiNodeInjectorMembersInjector,
      MembersInjector<ProductCustomerContributionNode>
          productCustomerContributionNodeInjectorMembersInjector,
      MembersInjector<ProductListNode> productListNodeInjectorMembersInjector,
      MembersInjector<ProductTotalLoanLmiAmountNode>
          productTotalLoanLmiAmountNodeInjectorMembersInjector,
      MembersInjector<ProductFeesNode> productFeesNodeInjectorMembersInjector,
      MembersInjector<ProductTotalLvrNode> productTotalLvrNodeInjectorMembersInjector) {
    assert settlementDateNodeInjectorMembersInjector != null;
    this.settlementDateNodeInjectorMembersInjector = settlementDateNodeInjectorMembersInjector;
    assert productTotalSecurityAmountNodeInjectorMembersInjector != null;
    this.productTotalSecurityAmountNodeInjectorMembersInjector =
        productTotalSecurityAmountNodeInjectorMembersInjector;
    assert productLoanTypeNodeInjectorMembersInjector != null;
    this.productLoanTypeNodeInjectorMembersInjector = productLoanTypeNodeInjectorMembersInjector;
    assert productTotalLoanAmountNodeInjectorMembersInjector != null;
    this.productTotalLoanAmountNodeInjectorMembersInjector =
        productTotalLoanAmountNodeInjectorMembersInjector;
    assert productTotalLvrLmiNodeInjectorMembersInjector != null;
    this.productTotalLvrLmiNodeInjectorMembersInjector =
        productTotalLvrLmiNodeInjectorMembersInjector;
    assert productCustomerContributionNodeInjectorMembersInjector != null;
    this.productCustomerContributionNodeInjectorMembersInjector =
        productCustomerContributionNodeInjectorMembersInjector;
    assert productListNodeInjectorMembersInjector != null;
    this.productListNodeInjectorMembersInjector = productListNodeInjectorMembersInjector;
    assert productTotalLoanLmiAmountNodeInjectorMembersInjector != null;
    this.productTotalLoanLmiAmountNodeInjectorMembersInjector =
        productTotalLoanLmiAmountNodeInjectorMembersInjector;
    assert productFeesNodeInjectorMembersInjector != null;
    this.productFeesNodeInjectorMembersInjector = productFeesNodeInjectorMembersInjector;
    assert productTotalLvrNodeInjectorMembersInjector != null;
    this.productTotalLvrNodeInjectorMembersInjector = productTotalLvrNodeInjectorMembersInjector;
  }

  public static MembersInjector<ProductsNodeChildProvider> create(
      MembersInjector<SettlementDateNode> settlementDateNodeInjectorMembersInjector,
      MembersInjector<ProductTotalSecurityAmountNode>
          productTotalSecurityAmountNodeInjectorMembersInjector,
      MembersInjector<ProductLoanTypeNode> productLoanTypeNodeInjectorMembersInjector,
      MembersInjector<ProductTotalLoanAmountNode> productTotalLoanAmountNodeInjectorMembersInjector,
      MembersInjector<ProductTotalLvrLmiNode> productTotalLvrLmiNodeInjectorMembersInjector,
      MembersInjector<ProductCustomerContributionNode>
          productCustomerContributionNodeInjectorMembersInjector,
      MembersInjector<ProductListNode> productListNodeInjectorMembersInjector,
      MembersInjector<ProductTotalLoanLmiAmountNode>
          productTotalLoanLmiAmountNodeInjectorMembersInjector,
      MembersInjector<ProductFeesNode> productFeesNodeInjectorMembersInjector,
      MembersInjector<ProductTotalLvrNode> productTotalLvrNodeInjectorMembersInjector) {
    return new ProductsNodeChildProvider_MembersInjector(
        settlementDateNodeInjectorMembersInjector,
        productTotalSecurityAmountNodeInjectorMembersInjector,
        productLoanTypeNodeInjectorMembersInjector,
        productTotalLoanAmountNodeInjectorMembersInjector,
        productTotalLvrLmiNodeInjectorMembersInjector,
        productCustomerContributionNodeInjectorMembersInjector,
        productListNodeInjectorMembersInjector,
        productTotalLoanLmiAmountNodeInjectorMembersInjector,
        productFeesNodeInjectorMembersInjector,
        productTotalLvrNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(ProductsNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.settlementDateNodeInjector = settlementDateNodeInjectorMembersInjector;
    instance.productTotalSecurityAmountNodeInjector =
        productTotalSecurityAmountNodeInjectorMembersInjector;
    instance.productLoanTypeNodeInjector = productLoanTypeNodeInjectorMembersInjector;
    instance.productTotalLoanAmountNodeInjector = productTotalLoanAmountNodeInjectorMembersInjector;
    instance.productTotalLvrLmiNodeInjector = productTotalLvrLmiNodeInjectorMembersInjector;
    instance.productCustomerContributionNodeInjector =
        productCustomerContributionNodeInjectorMembersInjector;
    instance.productListNodeInjector = productListNodeInjectorMembersInjector;
    instance.productTotalLoanLmiAmountNodeInjector =
        productTotalLoanLmiAmountNodeInjectorMembersInjector;
    instance.productFeesNodeInjector = productFeesNodeInjectorMembersInjector;
    instance.productTotalLvrNodeInjector = productTotalLvrNodeInjectorMembersInjector;
  }

  public static void injectSettlementDateNodeInjector(
      ProductsNodeChildProvider instance,
      MembersInjector<SettlementDateNode> settlementDateNodeInjector) {
    instance.settlementDateNodeInjector = settlementDateNodeInjector;
  }

  public static void injectProductTotalSecurityAmountNodeInjector(
      ProductsNodeChildProvider instance,
      MembersInjector<ProductTotalSecurityAmountNode> productTotalSecurityAmountNodeInjector) {
    instance.productTotalSecurityAmountNodeInjector = productTotalSecurityAmountNodeInjector;
  }

  public static void injectProductLoanTypeNodeInjector(
      ProductsNodeChildProvider instance,
      MembersInjector<ProductLoanTypeNode> productLoanTypeNodeInjector) {
    instance.productLoanTypeNodeInjector = productLoanTypeNodeInjector;
  }

  public static void injectProductTotalLoanAmountNodeInjector(
      ProductsNodeChildProvider instance,
      MembersInjector<ProductTotalLoanAmountNode> productTotalLoanAmountNodeInjector) {
    instance.productTotalLoanAmountNodeInjector = productTotalLoanAmountNodeInjector;
  }

  public static void injectProductTotalLvrLmiNodeInjector(
      ProductsNodeChildProvider instance,
      MembersInjector<ProductTotalLvrLmiNode> productTotalLvrLmiNodeInjector) {
    instance.productTotalLvrLmiNodeInjector = productTotalLvrLmiNodeInjector;
  }

  public static void injectProductCustomerContributionNodeInjector(
      ProductsNodeChildProvider instance,
      MembersInjector<ProductCustomerContributionNode> productCustomerContributionNodeInjector) {
    instance.productCustomerContributionNodeInjector = productCustomerContributionNodeInjector;
  }

  public static void injectProductListNodeInjector(
      ProductsNodeChildProvider instance,
      MembersInjector<ProductListNode> productListNodeInjector) {
    instance.productListNodeInjector = productListNodeInjector;
  }

  public static void injectProductTotalLoanLmiAmountNodeInjector(
      ProductsNodeChildProvider instance,
      MembersInjector<ProductTotalLoanLmiAmountNode> productTotalLoanLmiAmountNodeInjector) {
    instance.productTotalLoanLmiAmountNodeInjector = productTotalLoanLmiAmountNodeInjector;
  }

  public static void injectProductFeesNodeInjector(
      ProductsNodeChildProvider instance,
      MembersInjector<ProductFeesNode> productFeesNodeInjector) {
    instance.productFeesNodeInjector = productFeesNodeInjector;
  }

  public static void injectProductTotalLvrNodeInjector(
      ProductsNodeChildProvider instance,
      MembersInjector<ProductTotalLvrNode> productTotalLvrNodeInjector) {
    instance.productTotalLvrNodeInjector = productTotalLvrNodeInjector;
  }
}
