package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductAccountHolderListNodeRuleProvider_Factory
    implements Factory<ProductAccountHolderListNodeRuleProvider> {
  private final MembersInjector<ProductAccountHolderListNodeRuleProvider>
      productAccountHolderListNodeRuleProviderMembersInjector;

  public ProductAccountHolderListNodeRuleProvider_Factory(
      MembersInjector<ProductAccountHolderListNodeRuleProvider>
          productAccountHolderListNodeRuleProviderMembersInjector) {
    assert productAccountHolderListNodeRuleProviderMembersInjector != null;
    this.productAccountHolderListNodeRuleProviderMembersInjector =
        productAccountHolderListNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductAccountHolderListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productAccountHolderListNodeRuleProviderMembersInjector,
        new ProductAccountHolderListNodeRuleProvider());
  }

  public static Factory<ProductAccountHolderListNodeRuleProvider> create(
      MembersInjector<ProductAccountHolderListNodeRuleProvider>
          productAccountHolderListNodeRuleProviderMembersInjector) {
    return new ProductAccountHolderListNodeRuleProvider_Factory(
        productAccountHolderListNodeRuleProviderMembersInjector);
  }
}
