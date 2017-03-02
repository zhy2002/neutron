package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductInterestOnlyTermNodeRuleProvider_Factory
    implements Factory<ProductInterestOnlyTermNodeRuleProvider> {
  private final MembersInjector<ProductInterestOnlyTermNodeRuleProvider>
      productInterestOnlyTermNodeRuleProviderMembersInjector;

  public ProductInterestOnlyTermNodeRuleProvider_Factory(
      MembersInjector<ProductInterestOnlyTermNodeRuleProvider>
          productInterestOnlyTermNodeRuleProviderMembersInjector) {
    assert productInterestOnlyTermNodeRuleProviderMembersInjector != null;
    this.productInterestOnlyTermNodeRuleProviderMembersInjector =
        productInterestOnlyTermNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductInterestOnlyTermNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productInterestOnlyTermNodeRuleProviderMembersInjector,
        new ProductInterestOnlyTermNodeRuleProvider());
  }

  public static Factory<ProductInterestOnlyTermNodeRuleProvider> create(
      MembersInjector<ProductInterestOnlyTermNodeRuleProvider>
          productInterestOnlyTermNodeRuleProviderMembersInjector) {
    return new ProductInterestOnlyTermNodeRuleProvider_Factory(
        productInterestOnlyTermNodeRuleProviderMembersInjector);
  }
}
