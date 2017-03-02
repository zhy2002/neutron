package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.MovedToCurrentAddressNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ToCurrentNoEarlierThanToPreviousRuleImpl_Factory
    implements Factory<ToCurrentNoEarlierThanToPreviousRuleImpl> {
  private final MembersInjector<ToCurrentNoEarlierThanToPreviousRuleImpl>
      toCurrentNoEarlierThanToPreviousRuleImplMembersInjector;

  private final Provider<MovedToCurrentAddressNode> ownerProvider;

  public ToCurrentNoEarlierThanToPreviousRuleImpl_Factory(
      MembersInjector<ToCurrentNoEarlierThanToPreviousRuleImpl>
          toCurrentNoEarlierThanToPreviousRuleImplMembersInjector,
      Provider<MovedToCurrentAddressNode> ownerProvider) {
    assert toCurrentNoEarlierThanToPreviousRuleImplMembersInjector != null;
    this.toCurrentNoEarlierThanToPreviousRuleImplMembersInjector =
        toCurrentNoEarlierThanToPreviousRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public ToCurrentNoEarlierThanToPreviousRuleImpl get() {
    return MembersInjectors.injectMembers(
        toCurrentNoEarlierThanToPreviousRuleImplMembersInjector,
        new ToCurrentNoEarlierThanToPreviousRuleImpl(ownerProvider.get()));
  }

  public static Factory<ToCurrentNoEarlierThanToPreviousRuleImpl> create(
      MembersInjector<ToCurrentNoEarlierThanToPreviousRuleImpl>
          toCurrentNoEarlierThanToPreviousRuleImplMembersInjector,
      Provider<MovedToCurrentAddressNode> ownerProvider) {
    return new ToCurrentNoEarlierThanToPreviousRuleImpl_Factory(
        toCurrentNoEarlierThanToPreviousRuleImplMembersInjector, ownerProvider);
  }
}
