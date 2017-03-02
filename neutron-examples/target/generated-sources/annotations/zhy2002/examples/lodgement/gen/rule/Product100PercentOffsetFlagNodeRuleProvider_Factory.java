package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Product100PercentOffsetFlagNodeRuleProvider_Factory
    implements Factory<Product100PercentOffsetFlagNodeRuleProvider> {
  private final MembersInjector<Product100PercentOffsetFlagNodeRuleProvider>
      product100PercentOffsetFlagNodeRuleProviderMembersInjector;

  public Product100PercentOffsetFlagNodeRuleProvider_Factory(
      MembersInjector<Product100PercentOffsetFlagNodeRuleProvider>
          product100PercentOffsetFlagNodeRuleProviderMembersInjector) {
    assert product100PercentOffsetFlagNodeRuleProviderMembersInjector != null;
    this.product100PercentOffsetFlagNodeRuleProviderMembersInjector =
        product100PercentOffsetFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public Product100PercentOffsetFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        product100PercentOffsetFlagNodeRuleProviderMembersInjector,
        new Product100PercentOffsetFlagNodeRuleProvider());
  }

  public static Factory<Product100PercentOffsetFlagNodeRuleProvider> create(
      MembersInjector<Product100PercentOffsetFlagNodeRuleProvider>
          product100PercentOffsetFlagNodeRuleProviderMembersInjector) {
    return new Product100PercentOffsetFlagNodeRuleProvider_Factory(
        product100PercentOffsetFlagNodeRuleProviderMembersInjector);
  }
}
