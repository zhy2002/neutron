package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductConsolidationFlagNodeRuleProvider_Factory
    implements Factory<ProductConsolidationFlagNodeRuleProvider> {
  private final MembersInjector<ProductConsolidationFlagNodeRuleProvider>
      productConsolidationFlagNodeRuleProviderMembersInjector;

  public ProductConsolidationFlagNodeRuleProvider_Factory(
      MembersInjector<ProductConsolidationFlagNodeRuleProvider>
          productConsolidationFlagNodeRuleProviderMembersInjector) {
    assert productConsolidationFlagNodeRuleProviderMembersInjector != null;
    this.productConsolidationFlagNodeRuleProviderMembersInjector =
        productConsolidationFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductConsolidationFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productConsolidationFlagNodeRuleProviderMembersInjector,
        new ProductConsolidationFlagNodeRuleProvider());
  }

  public static Factory<ProductConsolidationFlagNodeRuleProvider> create(
      MembersInjector<ProductConsolidationFlagNodeRuleProvider>
          productConsolidationFlagNodeRuleProviderMembersInjector) {
    return new ProductConsolidationFlagNodeRuleProvider_Factory(
        productConsolidationFlagNodeRuleProviderMembersInjector);
  }
}
