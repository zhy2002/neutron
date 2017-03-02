package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MovedToPreviousAddressNodeRuleProvider_Factory
    implements Factory<MovedToPreviousAddressNodeRuleProvider> {
  private final MembersInjector<MovedToPreviousAddressNodeRuleProvider>
      movedToPreviousAddressNodeRuleProviderMembersInjector;

  public MovedToPreviousAddressNodeRuleProvider_Factory(
      MembersInjector<MovedToPreviousAddressNodeRuleProvider>
          movedToPreviousAddressNodeRuleProviderMembersInjector) {
    assert movedToPreviousAddressNodeRuleProviderMembersInjector != null;
    this.movedToPreviousAddressNodeRuleProviderMembersInjector =
        movedToPreviousAddressNodeRuleProviderMembersInjector;
  }

  @Override
  public MovedToPreviousAddressNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        movedToPreviousAddressNodeRuleProviderMembersInjector,
        new MovedToPreviousAddressNodeRuleProvider());
  }

  public static Factory<MovedToPreviousAddressNodeRuleProvider> create(
      MembersInjector<MovedToPreviousAddressNodeRuleProvider>
          movedToPreviousAddressNodeRuleProviderMembersInjector) {
    return new MovedToPreviousAddressNodeRuleProvider_Factory(
        movedToPreviousAddressNodeRuleProviderMembersInjector);
  }
}
