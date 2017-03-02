package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductDissatisfactionFlagNodeRuleProvider_Factory
    implements Factory<ProductDissatisfactionFlagNodeRuleProvider> {
  private final MembersInjector<ProductDissatisfactionFlagNodeRuleProvider>
      productDissatisfactionFlagNodeRuleProviderMembersInjector;

  public ProductDissatisfactionFlagNodeRuleProvider_Factory(
      MembersInjector<ProductDissatisfactionFlagNodeRuleProvider>
          productDissatisfactionFlagNodeRuleProviderMembersInjector) {
    assert productDissatisfactionFlagNodeRuleProviderMembersInjector != null;
    this.productDissatisfactionFlagNodeRuleProviderMembersInjector =
        productDissatisfactionFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductDissatisfactionFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productDissatisfactionFlagNodeRuleProviderMembersInjector,
        new ProductDissatisfactionFlagNodeRuleProvider());
  }

  public static Factory<ProductDissatisfactionFlagNodeRuleProvider> create(
      MembersInjector<ProductDissatisfactionFlagNodeRuleProvider>
          productDissatisfactionFlagNodeRuleProviderMembersInjector) {
    return new ProductDissatisfactionFlagNodeRuleProvider_Factory(
        productDissatisfactionFlagNodeRuleProviderMembersInjector);
  }
}
