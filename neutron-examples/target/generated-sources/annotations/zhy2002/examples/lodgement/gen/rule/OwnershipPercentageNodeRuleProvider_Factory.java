package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnershipPercentageNodeRuleProvider_Factory
    implements Factory<OwnershipPercentageNodeRuleProvider> {
  private final MembersInjector<OwnershipPercentageNodeRuleProvider>
      ownershipPercentageNodeRuleProviderMembersInjector;

  public OwnershipPercentageNodeRuleProvider_Factory(
      MembersInjector<OwnershipPercentageNodeRuleProvider>
          ownershipPercentageNodeRuleProviderMembersInjector) {
    assert ownershipPercentageNodeRuleProviderMembersInjector != null;
    this.ownershipPercentageNodeRuleProviderMembersInjector =
        ownershipPercentageNodeRuleProviderMembersInjector;
  }

  @Override
  public OwnershipPercentageNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        ownershipPercentageNodeRuleProviderMembersInjector,
        new OwnershipPercentageNodeRuleProvider());
  }

  public static Factory<OwnershipPercentageNodeRuleProvider> create(
      MembersInjector<OwnershipPercentageNodeRuleProvider>
          ownershipPercentageNodeRuleProviderMembersInjector) {
    return new OwnershipPercentageNodeRuleProvider_Factory(
        ownershipPercentageNodeRuleProviderMembersInjector);
  }
}
