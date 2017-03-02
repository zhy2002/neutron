package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCardHodlerNameNodeRuleProvider_Factory
    implements Factory<ProductCardHodlerNameNodeRuleProvider> {
  private final MembersInjector<ProductCardHodlerNameNodeRuleProvider>
      productCardHodlerNameNodeRuleProviderMembersInjector;

  public ProductCardHodlerNameNodeRuleProvider_Factory(
      MembersInjector<ProductCardHodlerNameNodeRuleProvider>
          productCardHodlerNameNodeRuleProviderMembersInjector) {
    assert productCardHodlerNameNodeRuleProviderMembersInjector != null;
    this.productCardHodlerNameNodeRuleProviderMembersInjector =
        productCardHodlerNameNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductCardHodlerNameNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productCardHodlerNameNodeRuleProviderMembersInjector,
        new ProductCardHodlerNameNodeRuleProvider());
  }

  public static Factory<ProductCardHodlerNameNodeRuleProvider> create(
      MembersInjector<ProductCardHodlerNameNodeRuleProvider>
          productCardHodlerNameNodeRuleProviderMembersInjector) {
    return new ProductCardHodlerNameNodeRuleProvider_Factory(
        productCardHodlerNameNodeRuleProviderMembersInjector);
  }
}
