package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MovedFromPreviousAddressNodeRuleProvider_Factory
    implements Factory<MovedFromPreviousAddressNodeRuleProvider> {
  private final MembersInjector<MovedFromPreviousAddressNodeRuleProvider>
      movedFromPreviousAddressNodeRuleProviderMembersInjector;

  public MovedFromPreviousAddressNodeRuleProvider_Factory(
      MembersInjector<MovedFromPreviousAddressNodeRuleProvider>
          movedFromPreviousAddressNodeRuleProviderMembersInjector) {
    assert movedFromPreviousAddressNodeRuleProviderMembersInjector != null;
    this.movedFromPreviousAddressNodeRuleProviderMembersInjector =
        movedFromPreviousAddressNodeRuleProviderMembersInjector;
  }

  @Override
  public MovedFromPreviousAddressNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        movedFromPreviousAddressNodeRuleProviderMembersInjector,
        new MovedFromPreviousAddressNodeRuleProvider());
  }

  public static Factory<MovedFromPreviousAddressNodeRuleProvider> create(
      MembersInjector<MovedFromPreviousAddressNodeRuleProvider>
          movedFromPreviousAddressNodeRuleProviderMembersInjector) {
    return new MovedFromPreviousAddressNodeRuleProvider_Factory(
        movedFromPreviousAddressNodeRuleProviderMembersInjector);
  }
}
