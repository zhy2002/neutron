package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductNodeRuleProvider_Factory implements Factory<ProductNodeRuleProvider> {
  private final MembersInjector<ProductNodeRuleProvider> productNodeRuleProviderMembersInjector;

  public ProductNodeRuleProvider_Factory(
      MembersInjector<ProductNodeRuleProvider> productNodeRuleProviderMembersInjector) {
    assert productNodeRuleProviderMembersInjector != null;
    this.productNodeRuleProviderMembersInjector = productNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productNodeRuleProviderMembersInjector, new ProductNodeRuleProvider());
  }

  public static Factory<ProductNodeRuleProvider> create(
      MembersInjector<ProductNodeRuleProvider> productNodeRuleProviderMembersInjector) {
    return new ProductNodeRuleProvider_Factory(productNodeRuleProviderMembersInjector);
  }
}
