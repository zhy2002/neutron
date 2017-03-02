package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.MovedFromPreviousAddressNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FromPreviousNoEarlierThanToPreviousRuleImpl_Factory
    implements Factory<FromPreviousNoEarlierThanToPreviousRuleImpl> {
  private final MembersInjector<FromPreviousNoEarlierThanToPreviousRuleImpl>
      fromPreviousNoEarlierThanToPreviousRuleImplMembersInjector;

  private final Provider<MovedFromPreviousAddressNode> ownerProvider;

  public FromPreviousNoEarlierThanToPreviousRuleImpl_Factory(
      MembersInjector<FromPreviousNoEarlierThanToPreviousRuleImpl>
          fromPreviousNoEarlierThanToPreviousRuleImplMembersInjector,
      Provider<MovedFromPreviousAddressNode> ownerProvider) {
    assert fromPreviousNoEarlierThanToPreviousRuleImplMembersInjector != null;
    this.fromPreviousNoEarlierThanToPreviousRuleImplMembersInjector =
        fromPreviousNoEarlierThanToPreviousRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public FromPreviousNoEarlierThanToPreviousRuleImpl get() {
    return MembersInjectors.injectMembers(
        fromPreviousNoEarlierThanToPreviousRuleImplMembersInjector,
        new FromPreviousNoEarlierThanToPreviousRuleImpl(ownerProvider.get()));
  }

  public static Factory<FromPreviousNoEarlierThanToPreviousRuleImpl> create(
      MembersInjector<FromPreviousNoEarlierThanToPreviousRuleImpl>
          fromPreviousNoEarlierThanToPreviousRuleImplMembersInjector,
      Provider<MovedFromPreviousAddressNode> ownerProvider) {
    return new FromPreviousNoEarlierThanToPreviousRuleImpl_Factory(
        fromPreviousNoEarlierThanToPreviousRuleImplMembersInjector, ownerProvider);
  }
}
