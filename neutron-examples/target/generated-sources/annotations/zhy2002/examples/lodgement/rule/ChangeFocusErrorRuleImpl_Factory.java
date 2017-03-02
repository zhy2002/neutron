package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.ErrorListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ChangeFocusErrorRuleImpl_Factory implements Factory<ChangeFocusErrorRuleImpl> {
  private final MembersInjector<ChangeFocusErrorRuleImpl> changeFocusErrorRuleImplMembersInjector;

  private final Provider<ErrorListNode> ownerProvider;

  public ChangeFocusErrorRuleImpl_Factory(
      MembersInjector<ChangeFocusErrorRuleImpl> changeFocusErrorRuleImplMembersInjector,
      Provider<ErrorListNode> ownerProvider) {
    assert changeFocusErrorRuleImplMembersInjector != null;
    this.changeFocusErrorRuleImplMembersInjector = changeFocusErrorRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public ChangeFocusErrorRuleImpl get() {
    return MembersInjectors.injectMembers(
        changeFocusErrorRuleImplMembersInjector, new ChangeFocusErrorRuleImpl(ownerProvider.get()));
  }

  public static Factory<ChangeFocusErrorRuleImpl> create(
      MembersInjector<ChangeFocusErrorRuleImpl> changeFocusErrorRuleImplMembersInjector,
      Provider<ErrorListNode> ownerProvider) {
    return new ChangeFocusErrorRuleImpl_Factory(
        changeFocusErrorRuleImplMembersInjector, ownerProvider);
  }
}
