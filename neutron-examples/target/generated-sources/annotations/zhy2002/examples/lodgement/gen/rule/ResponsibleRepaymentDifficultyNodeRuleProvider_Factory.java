package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResponsibleRepaymentDifficultyNodeRuleProvider_Factory
    implements Factory<ResponsibleRepaymentDifficultyNodeRuleProvider> {
  private final MembersInjector<ResponsibleRepaymentDifficultyNodeRuleProvider>
      responsibleRepaymentDifficultyNodeRuleProviderMembersInjector;

  public ResponsibleRepaymentDifficultyNodeRuleProvider_Factory(
      MembersInjector<ResponsibleRepaymentDifficultyNodeRuleProvider>
          responsibleRepaymentDifficultyNodeRuleProviderMembersInjector) {
    assert responsibleRepaymentDifficultyNodeRuleProviderMembersInjector != null;
    this.responsibleRepaymentDifficultyNodeRuleProviderMembersInjector =
        responsibleRepaymentDifficultyNodeRuleProviderMembersInjector;
  }

  @Override
  public ResponsibleRepaymentDifficultyNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        responsibleRepaymentDifficultyNodeRuleProviderMembersInjector,
        new ResponsibleRepaymentDifficultyNodeRuleProvider());
  }

  public static Factory<ResponsibleRepaymentDifficultyNodeRuleProvider> create(
      MembersInjector<ResponsibleRepaymentDifficultyNodeRuleProvider>
          responsibleRepaymentDifficultyNodeRuleProviderMembersInjector) {
    return new ResponsibleRepaymentDifficultyNodeRuleProvider_Factory(
        responsibleRepaymentDifficultyNodeRuleProviderMembersInjector);
  }
}
