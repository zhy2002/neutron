package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageLoanTermExpiryDateNodeRuleProvider_Factory
    implements Factory<MortgageLoanTermExpiryDateNodeRuleProvider> {
  private final MembersInjector<MortgageLoanTermExpiryDateNodeRuleProvider>
      mortgageLoanTermExpiryDateNodeRuleProviderMembersInjector;

  public MortgageLoanTermExpiryDateNodeRuleProvider_Factory(
      MembersInjector<MortgageLoanTermExpiryDateNodeRuleProvider>
          mortgageLoanTermExpiryDateNodeRuleProviderMembersInjector) {
    assert mortgageLoanTermExpiryDateNodeRuleProviderMembersInjector != null;
    this.mortgageLoanTermExpiryDateNodeRuleProviderMembersInjector =
        mortgageLoanTermExpiryDateNodeRuleProviderMembersInjector;
  }

  @Override
  public MortgageLoanTermExpiryDateNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        mortgageLoanTermExpiryDateNodeRuleProviderMembersInjector,
        new MortgageLoanTermExpiryDateNodeRuleProvider());
  }

  public static Factory<MortgageLoanTermExpiryDateNodeRuleProvider> create(
      MembersInjector<MortgageLoanTermExpiryDateNodeRuleProvider>
          mortgageLoanTermExpiryDateNodeRuleProviderMembersInjector) {
    return new MortgageLoanTermExpiryDateNodeRuleProvider_Factory(
        mortgageLoanTermExpiryDateNodeRuleProviderMembersInjector);
  }
}
