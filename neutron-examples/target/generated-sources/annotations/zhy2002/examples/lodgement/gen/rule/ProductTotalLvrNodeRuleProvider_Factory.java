package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLvrNodeRuleProvider_Factory
    implements Factory<ProductTotalLvrNodeRuleProvider> {
  private final MembersInjector<ProductTotalLvrNodeRuleProvider>
      productTotalLvrNodeRuleProviderMembersInjector;

  public ProductTotalLvrNodeRuleProvider_Factory(
      MembersInjector<ProductTotalLvrNodeRuleProvider>
          productTotalLvrNodeRuleProviderMembersInjector) {
    assert productTotalLvrNodeRuleProviderMembersInjector != null;
    this.productTotalLvrNodeRuleProviderMembersInjector =
        productTotalLvrNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductTotalLvrNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productTotalLvrNodeRuleProviderMembersInjector, new ProductTotalLvrNodeRuleProvider());
  }

  public static Factory<ProductTotalLvrNodeRuleProvider> create(
      MembersInjector<ProductTotalLvrNodeRuleProvider>
          productTotalLvrNodeRuleProviderMembersInjector) {
    return new ProductTotalLvrNodeRuleProvider_Factory(
        productTotalLvrNodeRuleProviderMembersInjector);
  }
}
