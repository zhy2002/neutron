package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductListNodeRuleProvider_Factory
    implements Factory<ProductListNodeRuleProvider> {
  private final MembersInjector<ProductListNodeRuleProvider>
      productListNodeRuleProviderMembersInjector;

  public ProductListNodeRuleProvider_Factory(
      MembersInjector<ProductListNodeRuleProvider> productListNodeRuleProviderMembersInjector) {
    assert productListNodeRuleProviderMembersInjector != null;
    this.productListNodeRuleProviderMembersInjector = productListNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productListNodeRuleProviderMembersInjector, new ProductListNodeRuleProvider());
  }

  public static Factory<ProductListNodeRuleProvider> create(
      MembersInjector<ProductListNodeRuleProvider> productListNodeRuleProviderMembersInjector) {
    return new ProductListNodeRuleProvider_Factory(productListNodeRuleProviderMembersInjector);
  }
}
