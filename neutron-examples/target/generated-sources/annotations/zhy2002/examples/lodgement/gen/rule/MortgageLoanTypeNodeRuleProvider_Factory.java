package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageLoanTypeNodeRuleProvider_Factory
    implements Factory<MortgageLoanTypeNodeRuleProvider> {
  private final MembersInjector<MortgageLoanTypeNodeRuleProvider>
      mortgageLoanTypeNodeRuleProviderMembersInjector;

  public MortgageLoanTypeNodeRuleProvider_Factory(
      MembersInjector<MortgageLoanTypeNodeRuleProvider>
          mortgageLoanTypeNodeRuleProviderMembersInjector) {
    assert mortgageLoanTypeNodeRuleProviderMembersInjector != null;
    this.mortgageLoanTypeNodeRuleProviderMembersInjector =
        mortgageLoanTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public MortgageLoanTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        mortgageLoanTypeNodeRuleProviderMembersInjector, new MortgageLoanTypeNodeRuleProvider());
  }

  public static Factory<MortgageLoanTypeNodeRuleProvider> create(
      MembersInjector<MortgageLoanTypeNodeRuleProvider>
          mortgageLoanTypeNodeRuleProviderMembersInjector) {
    return new MortgageLoanTypeNodeRuleProvider_Factory(
        mortgageLoanTypeNodeRuleProviderMembersInjector);
  }
}
