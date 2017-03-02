package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductDescriptionNodeRuleProvider_Factory
    implements Factory<ProductDescriptionNodeRuleProvider> {
  private final MembersInjector<ProductDescriptionNodeRuleProvider>
      productDescriptionNodeRuleProviderMembersInjector;

  public ProductDescriptionNodeRuleProvider_Factory(
      MembersInjector<ProductDescriptionNodeRuleProvider>
          productDescriptionNodeRuleProviderMembersInjector) {
    assert productDescriptionNodeRuleProviderMembersInjector != null;
    this.productDescriptionNodeRuleProviderMembersInjector =
        productDescriptionNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductDescriptionNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productDescriptionNodeRuleProviderMembersInjector,
        new ProductDescriptionNodeRuleProvider());
  }

  public static Factory<ProductDescriptionNodeRuleProvider> create(
      MembersInjector<ProductDescriptionNodeRuleProvider>
          productDescriptionNodeRuleProviderMembersInjector) {
    return new ProductDescriptionNodeRuleProvider_Factory(
        productDescriptionNodeRuleProviderMembersInjector);
  }
}
