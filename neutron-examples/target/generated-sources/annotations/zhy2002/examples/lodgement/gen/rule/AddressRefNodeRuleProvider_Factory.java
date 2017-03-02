package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddressRefNodeRuleProvider_Factory
    implements Factory<AddressRefNodeRuleProvider> {
  private final MembersInjector<AddressRefNodeRuleProvider>
      addressRefNodeRuleProviderMembersInjector;

  public AddressRefNodeRuleProvider_Factory(
      MembersInjector<AddressRefNodeRuleProvider> addressRefNodeRuleProviderMembersInjector) {
    assert addressRefNodeRuleProviderMembersInjector != null;
    this.addressRefNodeRuleProviderMembersInjector = addressRefNodeRuleProviderMembersInjector;
  }

  @Override
  public AddressRefNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        addressRefNodeRuleProviderMembersInjector, new AddressRefNodeRuleProvider());
  }

  public static Factory<AddressRefNodeRuleProvider> create(
      MembersInjector<AddressRefNodeRuleProvider> addressRefNodeRuleProviderMembersInjector) {
    return new AddressRefNodeRuleProvider_Factory(addressRefNodeRuleProviderMembersInjector);
  }
}
