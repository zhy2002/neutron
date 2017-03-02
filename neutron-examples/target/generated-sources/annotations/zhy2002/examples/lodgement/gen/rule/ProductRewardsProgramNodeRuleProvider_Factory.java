package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRewardsProgramNodeRuleProvider_Factory
    implements Factory<ProductRewardsProgramNodeRuleProvider> {
  private final MembersInjector<ProductRewardsProgramNodeRuleProvider>
      productRewardsProgramNodeRuleProviderMembersInjector;

  public ProductRewardsProgramNodeRuleProvider_Factory(
      MembersInjector<ProductRewardsProgramNodeRuleProvider>
          productRewardsProgramNodeRuleProviderMembersInjector) {
    assert productRewardsProgramNodeRuleProviderMembersInjector != null;
    this.productRewardsProgramNodeRuleProviderMembersInjector =
        productRewardsProgramNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductRewardsProgramNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productRewardsProgramNodeRuleProviderMembersInjector,
        new ProductRewardsProgramNodeRuleProvider());
  }

  public static Factory<ProductRewardsProgramNodeRuleProvider> create(
      MembersInjector<ProductRewardsProgramNodeRuleProvider>
          productRewardsProgramNodeRuleProviderMembersInjector) {
    return new ProductRewardsProgramNodeRuleProvider_Factory(
        productRewardsProgramNodeRuleProviderMembersInjector);
  }
}
