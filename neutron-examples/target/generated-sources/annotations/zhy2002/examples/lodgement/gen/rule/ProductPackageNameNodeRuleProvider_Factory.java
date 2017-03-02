package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductPackageNameNodeRuleProvider_Factory
    implements Factory<ProductPackageNameNodeRuleProvider> {
  private final MembersInjector<ProductPackageNameNodeRuleProvider>
      productPackageNameNodeRuleProviderMembersInjector;

  public ProductPackageNameNodeRuleProvider_Factory(
      MembersInjector<ProductPackageNameNodeRuleProvider>
          productPackageNameNodeRuleProviderMembersInjector) {
    assert productPackageNameNodeRuleProviderMembersInjector != null;
    this.productPackageNameNodeRuleProviderMembersInjector =
        productPackageNameNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductPackageNameNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productPackageNameNodeRuleProviderMembersInjector,
        new ProductPackageNameNodeRuleProvider());
  }

  public static Factory<ProductPackageNameNodeRuleProvider> create(
      MembersInjector<ProductPackageNameNodeRuleProvider>
          productPackageNameNodeRuleProviderMembersInjector) {
    return new ProductPackageNameNodeRuleProvider_Factory(
        productPackageNameNodeRuleProviderMembersInjector);
  }
}
