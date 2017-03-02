package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRateLockFlagNodeRuleProvider_Factory
    implements Factory<ProductRateLockFlagNodeRuleProvider> {
  private final MembersInjector<ProductRateLockFlagNodeRuleProvider>
      productRateLockFlagNodeRuleProviderMembersInjector;

  public ProductRateLockFlagNodeRuleProvider_Factory(
      MembersInjector<ProductRateLockFlagNodeRuleProvider>
          productRateLockFlagNodeRuleProviderMembersInjector) {
    assert productRateLockFlagNodeRuleProviderMembersInjector != null;
    this.productRateLockFlagNodeRuleProviderMembersInjector =
        productRateLockFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductRateLockFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productRateLockFlagNodeRuleProviderMembersInjector,
        new ProductRateLockFlagNodeRuleProvider());
  }

  public static Factory<ProductRateLockFlagNodeRuleProvider> create(
      MembersInjector<ProductRateLockFlagNodeRuleProvider>
          productRateLockFlagNodeRuleProviderMembersInjector) {
    return new ProductRateLockFlagNodeRuleProvider_Factory(
        productRateLockFlagNodeRuleProviderMembersInjector);
  }
}
