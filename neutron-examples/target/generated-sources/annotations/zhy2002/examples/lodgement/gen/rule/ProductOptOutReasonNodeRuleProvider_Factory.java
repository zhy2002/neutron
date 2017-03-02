package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductOptOutReasonNodeRuleProvider_Factory
    implements Factory<ProductOptOutReasonNodeRuleProvider> {
  private final MembersInjector<ProductOptOutReasonNodeRuleProvider>
      productOptOutReasonNodeRuleProviderMembersInjector;

  public ProductOptOutReasonNodeRuleProvider_Factory(
      MembersInjector<ProductOptOutReasonNodeRuleProvider>
          productOptOutReasonNodeRuleProviderMembersInjector) {
    assert productOptOutReasonNodeRuleProviderMembersInjector != null;
    this.productOptOutReasonNodeRuleProviderMembersInjector =
        productOptOutReasonNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductOptOutReasonNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productOptOutReasonNodeRuleProviderMembersInjector,
        new ProductOptOutReasonNodeRuleProvider());
  }

  public static Factory<ProductOptOutReasonNodeRuleProvider> create(
      MembersInjector<ProductOptOutReasonNodeRuleProvider>
          productOptOutReasonNodeRuleProviderMembersInjector) {
    return new ProductOptOutReasonNodeRuleProvider_Factory(
        productOptOutReasonNodeRuleProviderMembersInjector);
  }
}
