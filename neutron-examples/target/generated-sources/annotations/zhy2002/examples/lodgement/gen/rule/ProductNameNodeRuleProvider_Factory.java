package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductNameNodeRuleProvider_Factory
    implements Factory<ProductNameNodeRuleProvider> {
  private final MembersInjector<ProductNameNodeRuleProvider>
      productNameNodeRuleProviderMembersInjector;

  public ProductNameNodeRuleProvider_Factory(
      MembersInjector<ProductNameNodeRuleProvider> productNameNodeRuleProviderMembersInjector) {
    assert productNameNodeRuleProviderMembersInjector != null;
    this.productNameNodeRuleProviderMembersInjector = productNameNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductNameNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productNameNodeRuleProviderMembersInjector, new ProductNameNodeRuleProvider());
  }

  public static Factory<ProductNameNodeRuleProvider> create(
      MembersInjector<ProductNameNodeRuleProvider> productNameNodeRuleProviderMembersInjector) {
    return new ProductNameNodeRuleProvider_Factory(productNameNodeRuleProviderMembersInjector);
  }
}
