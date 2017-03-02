package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLvrLmiNodeRuleProvider_Factory
    implements Factory<ProductTotalLvrLmiNodeRuleProvider> {
  private final MembersInjector<ProductTotalLvrLmiNodeRuleProvider>
      productTotalLvrLmiNodeRuleProviderMembersInjector;

  public ProductTotalLvrLmiNodeRuleProvider_Factory(
      MembersInjector<ProductTotalLvrLmiNodeRuleProvider>
          productTotalLvrLmiNodeRuleProviderMembersInjector) {
    assert productTotalLvrLmiNodeRuleProviderMembersInjector != null;
    this.productTotalLvrLmiNodeRuleProviderMembersInjector =
        productTotalLvrLmiNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductTotalLvrLmiNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productTotalLvrLmiNodeRuleProviderMembersInjector,
        new ProductTotalLvrLmiNodeRuleProvider());
  }

  public static Factory<ProductTotalLvrLmiNodeRuleProvider> create(
      MembersInjector<ProductTotalLvrLmiNodeRuleProvider>
          productTotalLvrLmiNodeRuleProviderMembersInjector) {
    return new ProductTotalLvrLmiNodeRuleProvider_Factory(
        productTotalLvrLmiNodeRuleProviderMembersInjector);
  }
}
