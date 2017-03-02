package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MovedToCurrentAddressNodeRuleProvider_Factory
    implements Factory<MovedToCurrentAddressNodeRuleProvider> {
  private final MembersInjector<MovedToCurrentAddressNodeRuleProvider>
      movedToCurrentAddressNodeRuleProviderMembersInjector;

  public MovedToCurrentAddressNodeRuleProvider_Factory(
      MembersInjector<MovedToCurrentAddressNodeRuleProvider>
          movedToCurrentAddressNodeRuleProviderMembersInjector) {
    assert movedToCurrentAddressNodeRuleProviderMembersInjector != null;
    this.movedToCurrentAddressNodeRuleProviderMembersInjector =
        movedToCurrentAddressNodeRuleProviderMembersInjector;
  }

  @Override
  public MovedToCurrentAddressNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        movedToCurrentAddressNodeRuleProviderMembersInjector,
        new MovedToCurrentAddressNodeRuleProvider());
  }

  public static Factory<MovedToCurrentAddressNodeRuleProvider> create(
      MembersInjector<MovedToCurrentAddressNodeRuleProvider>
          movedToCurrentAddressNodeRuleProviderMembersInjector) {
    return new MovedToCurrentAddressNodeRuleProvider_Factory(
        movedToCurrentAddressNodeRuleProviderMembersInjector);
  }
}
