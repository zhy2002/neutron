package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductLendingPurposeNodeRuleProvider_Factory
    implements Factory<ProductLendingPurposeNodeRuleProvider> {
  private final MembersInjector<ProductLendingPurposeNodeRuleProvider>
      productLendingPurposeNodeRuleProviderMembersInjector;

  public ProductLendingPurposeNodeRuleProvider_Factory(
      MembersInjector<ProductLendingPurposeNodeRuleProvider>
          productLendingPurposeNodeRuleProviderMembersInjector) {
    assert productLendingPurposeNodeRuleProviderMembersInjector != null;
    this.productLendingPurposeNodeRuleProviderMembersInjector =
        productLendingPurposeNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductLendingPurposeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productLendingPurposeNodeRuleProviderMembersInjector,
        new ProductLendingPurposeNodeRuleProvider());
  }

  public static Factory<ProductLendingPurposeNodeRuleProvider> create(
      MembersInjector<ProductLendingPurposeNodeRuleProvider>
          productLendingPurposeNodeRuleProviderMembersInjector) {
    return new ProductLendingPurposeNodeRuleProvider_Factory(
        productLendingPurposeNodeRuleProviderMembersInjector);
  }
}
