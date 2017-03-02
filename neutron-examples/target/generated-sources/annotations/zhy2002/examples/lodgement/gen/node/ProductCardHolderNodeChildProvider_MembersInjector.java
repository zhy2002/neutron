package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCardHolderNodeChildProvider_MembersInjector
    implements MembersInjector<ProductCardHolderNodeChildProvider> {
  private final MembersInjector<ProductRewardsMembershipNode>
      productRewardsMembershipNodeInjectorMembersInjector;

  private final MembersInjector<ProductCardHodlerNameNode>
      productCardHodlerNameNodeInjectorMembersInjector;

  private final MembersInjector<ProductRewardsProgramNode>
      productRewardsProgramNodeInjectorMembersInjector;

  public ProductCardHolderNodeChildProvider_MembersInjector(
      MembersInjector<ProductRewardsMembershipNode>
          productRewardsMembershipNodeInjectorMembersInjector,
      MembersInjector<ProductCardHodlerNameNode> productCardHodlerNameNodeInjectorMembersInjector,
      MembersInjector<ProductRewardsProgramNode> productRewardsProgramNodeInjectorMembersInjector) {
    assert productRewardsMembershipNodeInjectorMembersInjector != null;
    this.productRewardsMembershipNodeInjectorMembersInjector =
        productRewardsMembershipNodeInjectorMembersInjector;
    assert productCardHodlerNameNodeInjectorMembersInjector != null;
    this.productCardHodlerNameNodeInjectorMembersInjector =
        productCardHodlerNameNodeInjectorMembersInjector;
    assert productRewardsProgramNodeInjectorMembersInjector != null;
    this.productRewardsProgramNodeInjectorMembersInjector =
        productRewardsProgramNodeInjectorMembersInjector;
  }

  public static MembersInjector<ProductCardHolderNodeChildProvider> create(
      MembersInjector<ProductRewardsMembershipNode>
          productRewardsMembershipNodeInjectorMembersInjector,
      MembersInjector<ProductCardHodlerNameNode> productCardHodlerNameNodeInjectorMembersInjector,
      MembersInjector<ProductRewardsProgramNode> productRewardsProgramNodeInjectorMembersInjector) {
    return new ProductCardHolderNodeChildProvider_MembersInjector(
        productRewardsMembershipNodeInjectorMembersInjector,
        productCardHodlerNameNodeInjectorMembersInjector,
        productRewardsProgramNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(ProductCardHolderNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.productRewardsMembershipNodeInjector =
        productRewardsMembershipNodeInjectorMembersInjector;
    instance.productCardHodlerNameNodeInjector = productCardHodlerNameNodeInjectorMembersInjector;
    instance.productRewardsProgramNodeInjector = productRewardsProgramNodeInjectorMembersInjector;
  }

  public static void injectProductRewardsMembershipNodeInjector(
      ProductCardHolderNodeChildProvider instance,
      MembersInjector<ProductRewardsMembershipNode> productRewardsMembershipNodeInjector) {
    instance.productRewardsMembershipNodeInjector = productRewardsMembershipNodeInjector;
  }

  public static void injectProductCardHodlerNameNodeInjector(
      ProductCardHolderNodeChildProvider instance,
      MembersInjector<ProductCardHodlerNameNode> productCardHodlerNameNodeInjector) {
    instance.productCardHodlerNameNodeInjector = productCardHodlerNameNodeInjector;
  }

  public static void injectProductRewardsProgramNodeInjector(
      ProductCardHolderNodeChildProvider instance,
      MembersInjector<ProductRewardsProgramNode> productRewardsProgramNodeInjector) {
    instance.productRewardsProgramNodeInjector = productRewardsProgramNodeInjector;
  }
}
