package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RentedFlagNodeRuleProvider_Factory
    implements Factory<RentedFlagNodeRuleProvider> {
  private final MembersInjector<RentedFlagNodeRuleProvider>
      rentedFlagNodeRuleProviderMembersInjector;

  public RentedFlagNodeRuleProvider_Factory(
      MembersInjector<RentedFlagNodeRuleProvider> rentedFlagNodeRuleProviderMembersInjector) {
    assert rentedFlagNodeRuleProviderMembersInjector != null;
    this.rentedFlagNodeRuleProviderMembersInjector = rentedFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public RentedFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        rentedFlagNodeRuleProviderMembersInjector, new RentedFlagNodeRuleProvider());
  }

  public static Factory<RentedFlagNodeRuleProvider> create(
      MembersInjector<RentedFlagNodeRuleProvider> rentedFlagNodeRuleProviderMembersInjector) {
    return new RentedFlagNodeRuleProvider_Factory(rentedFlagNodeRuleProviderMembersInjector);
  }
}
