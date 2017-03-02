package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddressLineNodeRuleProvider_Factory
    implements Factory<AddressLineNodeRuleProvider> {
  private final MembersInjector<AddressLineNodeRuleProvider>
      addressLineNodeRuleProviderMembersInjector;

  public AddressLineNodeRuleProvider_Factory(
      MembersInjector<AddressLineNodeRuleProvider> addressLineNodeRuleProviderMembersInjector) {
    assert addressLineNodeRuleProviderMembersInjector != null;
    this.addressLineNodeRuleProviderMembersInjector = addressLineNodeRuleProviderMembersInjector;
  }

  @Override
  public AddressLineNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        addressLineNodeRuleProviderMembersInjector, new AddressLineNodeRuleProvider());
  }

  public static Factory<AddressLineNodeRuleProvider> create(
      MembersInjector<AddressLineNodeRuleProvider> addressLineNodeRuleProviderMembersInjector) {
    return new AddressLineNodeRuleProvider_Factory(addressLineNodeRuleProviderMembersInjector);
  }
}
