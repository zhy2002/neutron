package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ShowErrorListRuleImpl_Factory implements Factory<ShowErrorListRuleImpl> {
  private final MembersInjector<ShowErrorListRuleImpl> showErrorListRuleImplMembersInjector;

  private final Provider<ApplicationNode> ownerProvider;

  public ShowErrorListRuleImpl_Factory(
      MembersInjector<ShowErrorListRuleImpl> showErrorListRuleImplMembersInjector,
      Provider<ApplicationNode> ownerProvider) {
    assert showErrorListRuleImplMembersInjector != null;
    this.showErrorListRuleImplMembersInjector = showErrorListRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public ShowErrorListRuleImpl get() {
    return MembersInjectors.injectMembers(
        showErrorListRuleImplMembersInjector, new ShowErrorListRuleImpl(ownerProvider.get()));
  }

  public static Factory<ShowErrorListRuleImpl> create(
      MembersInjector<ShowErrorListRuleImpl> showErrorListRuleImplMembersInjector,
      Provider<ApplicationNode> ownerProvider) {
    return new ShowErrorListRuleImpl_Factory(showErrorListRuleImplMembersInjector, ownerProvider);
  }
}
