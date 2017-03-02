package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.AddressNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UpdateAddressRefListRuleImpl_Factory
    implements Factory<UpdateAddressRefListRuleImpl> {
  private final MembersInjector<UpdateAddressRefListRuleImpl>
      updateAddressRefListRuleImplMembersInjector;

  private final Provider<AddressNode<?>> ownerProvider;

  public UpdateAddressRefListRuleImpl_Factory(
      MembersInjector<UpdateAddressRefListRuleImpl> updateAddressRefListRuleImplMembersInjector,
      Provider<AddressNode<?>> ownerProvider) {
    assert updateAddressRefListRuleImplMembersInjector != null;
    this.updateAddressRefListRuleImplMembersInjector = updateAddressRefListRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public UpdateAddressRefListRuleImpl get() {
    return MembersInjectors.injectMembers(
        updateAddressRefListRuleImplMembersInjector,
        new UpdateAddressRefListRuleImpl(ownerProvider.get()));
  }

  public static Factory<UpdateAddressRefListRuleImpl> create(
      MembersInjector<UpdateAddressRefListRuleImpl> updateAddressRefListRuleImplMembersInjector,
      Provider<AddressNode<?>> ownerProvider) {
    return new UpdateAddressRefListRuleImpl_Factory(
        updateAddressRefListRuleImplMembersInjector, ownerProvider);
  }
}
