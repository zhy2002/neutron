package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductFixedTermNodeRuleProvider_Factory
    implements Factory<ProductFixedTermNodeRuleProvider> {
  private final MembersInjector<ProductFixedTermNodeRuleProvider>
      productFixedTermNodeRuleProviderMembersInjector;

  public ProductFixedTermNodeRuleProvider_Factory(
      MembersInjector<ProductFixedTermNodeRuleProvider>
          productFixedTermNodeRuleProviderMembersInjector) {
    assert productFixedTermNodeRuleProviderMembersInjector != null;
    this.productFixedTermNodeRuleProviderMembersInjector =
        productFixedTermNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductFixedTermNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productFixedTermNodeRuleProviderMembersInjector, new ProductFixedTermNodeRuleProvider());
  }

  public static Factory<ProductFixedTermNodeRuleProvider> create(
      MembersInjector<ProductFixedTermNodeRuleProvider>
          productFixedTermNodeRuleProviderMembersInjector) {
    return new ProductFixedTermNodeRuleProvider_Factory(
        productFixedTermNodeRuleProviderMembersInjector);
  }
}
