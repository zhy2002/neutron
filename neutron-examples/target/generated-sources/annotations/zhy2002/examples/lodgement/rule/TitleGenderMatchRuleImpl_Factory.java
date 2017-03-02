package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.TitleNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TitleGenderMatchRuleImpl_Factory implements Factory<TitleGenderMatchRuleImpl> {
  private final MembersInjector<TitleGenderMatchRuleImpl> titleGenderMatchRuleImplMembersInjector;

  private final Provider<TitleNode> ownerProvider;

  public TitleGenderMatchRuleImpl_Factory(
      MembersInjector<TitleGenderMatchRuleImpl> titleGenderMatchRuleImplMembersInjector,
      Provider<TitleNode> ownerProvider) {
    assert titleGenderMatchRuleImplMembersInjector != null;
    this.titleGenderMatchRuleImplMembersInjector = titleGenderMatchRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public TitleGenderMatchRuleImpl get() {
    return MembersInjectors.injectMembers(
        titleGenderMatchRuleImplMembersInjector, new TitleGenderMatchRuleImpl(ownerProvider.get()));
  }

  public static Factory<TitleGenderMatchRuleImpl> create(
      MembersInjector<TitleGenderMatchRuleImpl> titleGenderMatchRuleImplMembersInjector,
      Provider<TitleNode> ownerProvider) {
    return new TitleGenderMatchRuleImpl_Factory(
        titleGenderMatchRuleImplMembersInjector, ownerProvider);
  }
}
