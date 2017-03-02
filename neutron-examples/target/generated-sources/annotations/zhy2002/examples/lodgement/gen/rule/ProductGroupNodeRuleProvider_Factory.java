package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductGroupNodeRuleProvider_Factory
    implements Factory<ProductGroupNodeRuleProvider> {
  private final MembersInjector<ProductGroupNodeRuleProvider>
      productGroupNodeRuleProviderMembersInjector;

  public ProductGroupNodeRuleProvider_Factory(
      MembersInjector<ProductGroupNodeRuleProvider> productGroupNodeRuleProviderMembersInjector) {
    assert productGroupNodeRuleProviderMembersInjector != null;
    this.productGroupNodeRuleProviderMembersInjector = productGroupNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductGroupNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productGroupNodeRuleProviderMembersInjector, new ProductGroupNodeRuleProvider());
  }

  public static Factory<ProductGroupNodeRuleProvider> create(
      MembersInjector<ProductGroupNodeRuleProvider> productGroupNodeRuleProviderMembersInjector) {
    return new ProductGroupNodeRuleProvider_Factory(productGroupNodeRuleProviderMembersInjector);
  }
}
