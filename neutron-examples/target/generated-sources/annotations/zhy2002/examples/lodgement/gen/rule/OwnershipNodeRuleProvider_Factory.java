package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnershipNodeRuleProvider_Factory implements Factory<OwnershipNodeRuleProvider> {
  private final MembersInjector<OwnershipNodeRuleProvider> ownershipNodeRuleProviderMembersInjector;

  public OwnershipNodeRuleProvider_Factory(
      MembersInjector<OwnershipNodeRuleProvider> ownershipNodeRuleProviderMembersInjector) {
    assert ownershipNodeRuleProviderMembersInjector != null;
    this.ownershipNodeRuleProviderMembersInjector = ownershipNodeRuleProviderMembersInjector;
  }

  @Override
  public OwnershipNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        ownershipNodeRuleProviderMembersInjector, new OwnershipNodeRuleProvider());
  }

  public static Factory<OwnershipNodeRuleProvider> create(
      MembersInjector<OwnershipNodeRuleProvider> ownershipNodeRuleProviderMembersInjector) {
    return new OwnershipNodeRuleProvider_Factory(ownershipNodeRuleProviderMembersInjector);
  }
}
