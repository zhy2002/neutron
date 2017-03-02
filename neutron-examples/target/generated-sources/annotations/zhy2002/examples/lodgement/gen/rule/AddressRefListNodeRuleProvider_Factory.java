package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddressRefListNodeRuleProvider_Factory
    implements Factory<AddressRefListNodeRuleProvider> {
  private final MembersInjector<AddressRefListNodeRuleProvider>
      addressRefListNodeRuleProviderMembersInjector;

  public AddressRefListNodeRuleProvider_Factory(
      MembersInjector<AddressRefListNodeRuleProvider>
          addressRefListNodeRuleProviderMembersInjector) {
    assert addressRefListNodeRuleProviderMembersInjector != null;
    this.addressRefListNodeRuleProviderMembersInjector =
        addressRefListNodeRuleProviderMembersInjector;
  }

  @Override
  public AddressRefListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        addressRefListNodeRuleProviderMembersInjector, new AddressRefListNodeRuleProvider());
  }

  public static Factory<AddressRefListNodeRuleProvider> create(
      MembersInjector<AddressRefListNodeRuleProvider>
          addressRefListNodeRuleProviderMembersInjector) {
    return new AddressRefListNodeRuleProvider_Factory(
        addressRefListNodeRuleProviderMembersInjector);
  }
}
