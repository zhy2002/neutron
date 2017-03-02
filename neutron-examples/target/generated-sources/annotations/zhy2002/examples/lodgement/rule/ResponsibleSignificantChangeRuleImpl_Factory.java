package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.ResponsibleSignificantChangeFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResponsibleSignificantChangeRuleImpl_Factory
    implements Factory<ResponsibleSignificantChangeRuleImpl> {
  private final MembersInjector<ResponsibleSignificantChangeRuleImpl>
      responsibleSignificantChangeRuleImplMembersInjector;

  private final Provider<ResponsibleSignificantChangeFlagNode> ownerProvider;

  public ResponsibleSignificantChangeRuleImpl_Factory(
      MembersInjector<ResponsibleSignificantChangeRuleImpl>
          responsibleSignificantChangeRuleImplMembersInjector,
      Provider<ResponsibleSignificantChangeFlagNode> ownerProvider) {
    assert responsibleSignificantChangeRuleImplMembersInjector != null;
    this.responsibleSignificantChangeRuleImplMembersInjector =
        responsibleSignificantChangeRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public ResponsibleSignificantChangeRuleImpl get() {
    return MembersInjectors.injectMembers(
        responsibleSignificantChangeRuleImplMembersInjector,
        new ResponsibleSignificantChangeRuleImpl(ownerProvider.get()));
  }

  public static Factory<ResponsibleSignificantChangeRuleImpl> create(
      MembersInjector<ResponsibleSignificantChangeRuleImpl>
          responsibleSignificantChangeRuleImplMembersInjector,
      Provider<ResponsibleSignificantChangeFlagNode> ownerProvider) {
    return new ResponsibleSignificantChangeRuleImpl_Factory(
        responsibleSignificantChangeRuleImplMembersInjector, ownerProvider);
  }
}
