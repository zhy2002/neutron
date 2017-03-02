package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BeingPurchasedFlagNodeRuleProvider_Factory
    implements Factory<BeingPurchasedFlagNodeRuleProvider> {
  private final MembersInjector<BeingPurchasedFlagNodeRuleProvider>
      beingPurchasedFlagNodeRuleProviderMembersInjector;

  public BeingPurchasedFlagNodeRuleProvider_Factory(
      MembersInjector<BeingPurchasedFlagNodeRuleProvider>
          beingPurchasedFlagNodeRuleProviderMembersInjector) {
    assert beingPurchasedFlagNodeRuleProviderMembersInjector != null;
    this.beingPurchasedFlagNodeRuleProviderMembersInjector =
        beingPurchasedFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public BeingPurchasedFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        beingPurchasedFlagNodeRuleProviderMembersInjector,
        new BeingPurchasedFlagNodeRuleProvider());
  }

  public static Factory<BeingPurchasedFlagNodeRuleProvider> create(
      MembersInjector<BeingPurchasedFlagNodeRuleProvider>
          beingPurchasedFlagNodeRuleProviderMembersInjector) {
    return new BeingPurchasedFlagNodeRuleProvider_Factory(
        beingPurchasedFlagNodeRuleProviderMembersInjector);
  }
}
