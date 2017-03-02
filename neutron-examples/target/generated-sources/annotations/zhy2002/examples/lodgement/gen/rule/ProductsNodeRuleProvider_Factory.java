package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductsNodeRuleProvider_Factory implements Factory<ProductsNodeRuleProvider> {
  private final MembersInjector<ProductsNodeRuleProvider> productsNodeRuleProviderMembersInjector;

  public ProductsNodeRuleProvider_Factory(
      MembersInjector<ProductsNodeRuleProvider> productsNodeRuleProviderMembersInjector) {
    assert productsNodeRuleProviderMembersInjector != null;
    this.productsNodeRuleProviderMembersInjector = productsNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductsNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productsNodeRuleProviderMembersInjector, new ProductsNodeRuleProvider());
  }

  public static Factory<ProductsNodeRuleProvider> create(
      MembersInjector<ProductsNodeRuleProvider> productsNodeRuleProviderMembersInjector) {
    return new ProductsNodeRuleProvider_Factory(productsNodeRuleProviderMembersInjector);
  }
}
