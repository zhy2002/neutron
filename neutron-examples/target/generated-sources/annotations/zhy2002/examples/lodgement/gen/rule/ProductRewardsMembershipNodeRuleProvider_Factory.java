package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRewardsMembershipNodeRuleProvider_Factory
    implements Factory<ProductRewardsMembershipNodeRuleProvider> {
  private final MembersInjector<ProductRewardsMembershipNodeRuleProvider>
      productRewardsMembershipNodeRuleProviderMembersInjector;

  public ProductRewardsMembershipNodeRuleProvider_Factory(
      MembersInjector<ProductRewardsMembershipNodeRuleProvider>
          productRewardsMembershipNodeRuleProviderMembersInjector) {
    assert productRewardsMembershipNodeRuleProviderMembersInjector != null;
    this.productRewardsMembershipNodeRuleProviderMembersInjector =
        productRewardsMembershipNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductRewardsMembershipNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productRewardsMembershipNodeRuleProviderMembersInjector,
        new ProductRewardsMembershipNodeRuleProvider());
  }

  public static Factory<ProductRewardsMembershipNodeRuleProvider> create(
      MembersInjector<ProductRewardsMembershipNodeRuleProvider>
          productRewardsMembershipNodeRuleProviderMembersInjector) {
    return new ProductRewardsMembershipNodeRuleProvider_Factory(
        productRewardsMembershipNodeRuleProviderMembersInjector);
  }
}
