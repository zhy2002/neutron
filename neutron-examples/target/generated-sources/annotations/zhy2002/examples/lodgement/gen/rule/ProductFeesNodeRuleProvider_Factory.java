package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductFeesNodeRuleProvider_Factory
    implements Factory<ProductFeesNodeRuleProvider> {
  private final MembersInjector<ProductFeesNodeRuleProvider>
      productFeesNodeRuleProviderMembersInjector;

  public ProductFeesNodeRuleProvider_Factory(
      MembersInjector<ProductFeesNodeRuleProvider> productFeesNodeRuleProviderMembersInjector) {
    assert productFeesNodeRuleProviderMembersInjector != null;
    this.productFeesNodeRuleProviderMembersInjector = productFeesNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductFeesNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productFeesNodeRuleProviderMembersInjector, new ProductFeesNodeRuleProvider());
  }

  public static Factory<ProductFeesNodeRuleProvider> create(
      MembersInjector<ProductFeesNodeRuleProvider> productFeesNodeRuleProviderMembersInjector) {
    return new ProductFeesNodeRuleProvider_Factory(productFeesNodeRuleProviderMembersInjector);
  }
}
