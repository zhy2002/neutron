package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageLenderInstitutionNodeRuleProvider_Factory
    implements Factory<MortgageLenderInstitutionNodeRuleProvider> {
  private final MembersInjector<MortgageLenderInstitutionNodeRuleProvider>
      mortgageLenderInstitutionNodeRuleProviderMembersInjector;

  public MortgageLenderInstitutionNodeRuleProvider_Factory(
      MembersInjector<MortgageLenderInstitutionNodeRuleProvider>
          mortgageLenderInstitutionNodeRuleProviderMembersInjector) {
    assert mortgageLenderInstitutionNodeRuleProviderMembersInjector != null;
    this.mortgageLenderInstitutionNodeRuleProviderMembersInjector =
        mortgageLenderInstitutionNodeRuleProviderMembersInjector;
  }

  @Override
  public MortgageLenderInstitutionNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        mortgageLenderInstitutionNodeRuleProviderMembersInjector,
        new MortgageLenderInstitutionNodeRuleProvider());
  }

  public static Factory<MortgageLenderInstitutionNodeRuleProvider> create(
      MembersInjector<MortgageLenderInstitutionNodeRuleProvider>
          mortgageLenderInstitutionNodeRuleProviderMembersInjector) {
    return new MortgageLenderInstitutionNodeRuleProvider_Factory(
        mortgageLenderInstitutionNodeRuleProviderMembersInjector);
  }
}
