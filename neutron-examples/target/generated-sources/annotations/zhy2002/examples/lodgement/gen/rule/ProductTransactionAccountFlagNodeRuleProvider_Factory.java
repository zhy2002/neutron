package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTransactionAccountFlagNodeRuleProvider_Factory
    implements Factory<ProductTransactionAccountFlagNodeRuleProvider> {
  private final MembersInjector<ProductTransactionAccountFlagNodeRuleProvider>
      productTransactionAccountFlagNodeRuleProviderMembersInjector;

  public ProductTransactionAccountFlagNodeRuleProvider_Factory(
      MembersInjector<ProductTransactionAccountFlagNodeRuleProvider>
          productTransactionAccountFlagNodeRuleProviderMembersInjector) {
    assert productTransactionAccountFlagNodeRuleProviderMembersInjector != null;
    this.productTransactionAccountFlagNodeRuleProviderMembersInjector =
        productTransactionAccountFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductTransactionAccountFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productTransactionAccountFlagNodeRuleProviderMembersInjector,
        new ProductTransactionAccountFlagNodeRuleProvider());
  }

  public static Factory<ProductTransactionAccountFlagNodeRuleProvider> create(
      MembersInjector<ProductTransactionAccountFlagNodeRuleProvider>
          productTransactionAccountFlagNodeRuleProviderMembersInjector) {
    return new ProductTransactionAccountFlagNodeRuleProvider_Factory(
        productTransactionAccountFlagNodeRuleProviderMembersInjector);
  }
}
