package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeAmountNodeRuleProvider_Factory
    implements Factory<OtherIncomeAmountNodeRuleProvider> {
  private final MembersInjector<OtherIncomeAmountNodeRuleProvider>
      otherIncomeAmountNodeRuleProviderMembersInjector;

  public OtherIncomeAmountNodeRuleProvider_Factory(
      MembersInjector<OtherIncomeAmountNodeRuleProvider>
          otherIncomeAmountNodeRuleProviderMembersInjector) {
    assert otherIncomeAmountNodeRuleProviderMembersInjector != null;
    this.otherIncomeAmountNodeRuleProviderMembersInjector =
        otherIncomeAmountNodeRuleProviderMembersInjector;
  }

  @Override
  public OtherIncomeAmountNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        otherIncomeAmountNodeRuleProviderMembersInjector, new OtherIncomeAmountNodeRuleProvider());
  }

  public static Factory<OtherIncomeAmountNodeRuleProvider> create(
      MembersInjector<OtherIncomeAmountNodeRuleProvider>
          otherIncomeAmountNodeRuleProviderMembersInjector) {
    return new OtherIncomeAmountNodeRuleProvider_Factory(
        otherIncomeAmountNodeRuleProviderMembersInjector);
  }
}
