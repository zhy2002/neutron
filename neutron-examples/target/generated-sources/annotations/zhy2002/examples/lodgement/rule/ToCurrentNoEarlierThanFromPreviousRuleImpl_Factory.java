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
public final class ToCurrentNoEarlierThanFromPreviousRuleImpl_Factory
    implements Factory<ToCurrentNoEarlierThanFromPreviousRuleImpl> {
  private final MembersInjector<ToCurrentNoEarlierThanFromPreviousRuleImpl>
      toCurrentNoEarlierThanFromPreviousRuleImplMembersInjector;

  private final Provider<MovedToCurrentAddressNode> ownerProvider;

  public ToCurrentNoEarlierThanFromPreviousRuleImpl_Factory(
      MembersInjector<ToCurrentNoEarlierThanFromPreviousRuleImpl>
          toCurrentNoEarlierThanFromPreviousRuleImplMembersInjector,
      Provider<MovedToCurrentAddressNode> ownerProvider) {
    assert toCurrentNoEarlierThanFromPreviousRuleImplMembersInjector != null;
    this.toCurrentNoEarlierThanFromPreviousRuleImplMembersInjector =
        toCurrentNoEarlierThanFromPreviousRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public ToCurrentNoEarlierThanFromPreviousRuleImpl get() {
    return MembersInjectors.injectMembers(
        toCurrentNoEarlierThanFromPreviousRuleImplMembersInjector,
        new ToCurrentNoEarlierThanFromPreviousRuleImpl(ownerProvider.get()));
  }

  public static Factory<ToCurrentNoEarlierThanFromPreviousRuleImpl> create(
      MembersInjector<ToCurrentNoEarlierThanFromPreviousRuleImpl>
          toCurrentNoEarlierThanFromPreviousRuleImplMembersInjector,
      Provider<MovedToCurrentAddressNode> ownerProvider) {
    return new ToCurrentNoEarlierThanFromPreviousRuleImpl_Factory(
        toCurrentNoEarlierThanFromPreviousRuleImplMembersInjector, ownerProvider);
  }
}
