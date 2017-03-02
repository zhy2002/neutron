package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCardHolderNodeRuleProvider_Factory
    implements Factory<ProductCardHolderNodeRuleProvider> {
  private final MembersInjector<ProductCardHolderNodeRuleProvider>
      productCardHolderNodeRuleProviderMembersInjector;

  public ProductCardHolderNodeRuleProvider_Factory(
      MembersInjector<ProductCardHolderNodeRuleProvider>
          productCardHolderNodeRuleProviderMembersInjector) {
    assert productCardHolderNodeRuleProviderMembersInjector != null;
    this.productCardHolderNodeRuleProviderMembersInjector =
        productCardHolderNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductCardHolderNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productCardHolderNodeRuleProviderMembersInjector, new ProductCardHolderNodeRuleProvider());
  }

  public static Factory<ProductCardHolderNodeRuleProvider> create(
      MembersInjector<ProductCardHolderNodeRuleProvider>
          productCardHolderNodeRuleProviderMembersInjector) {
    return new ProductCardHolderNodeRuleProvider_Factory(
        productCardHolderNodeRuleProviderMembersInjector);
  }
}
