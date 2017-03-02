package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeAddBackTypeNodeRuleProvider_Factory
    implements Factory<OtherIncomeAddBackTypeNodeRuleProvider> {
  private final MembersInjector<OtherIncomeAddBackTypeNodeRuleProvider>
      otherIncomeAddBackTypeNodeRuleProviderMembersInjector;

  public OtherIncomeAddBackTypeNodeRuleProvider_Factory(
      MembersInjector<OtherIncomeAddBackTypeNodeRuleProvider>
          otherIncomeAddBackTypeNodeRuleProviderMembersInjector) {
    assert otherIncomeAddBackTypeNodeRuleProviderMembersInjector != null;
    this.otherIncomeAddBackTypeNodeRuleProviderMembersInjector =
        otherIncomeAddBackTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public OtherIncomeAddBackTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        otherIncomeAddBackTypeNodeRuleProviderMembersInjector,
        new OtherIncomeAddBackTypeNodeRuleProvider());
  }

  public static Factory<OtherIncomeAddBackTypeNodeRuleProvider> create(
      MembersInjector<OtherIncomeAddBackTypeNodeRuleProvider>
          otherIncomeAddBackTypeNodeRuleProviderMembersInjector) {
    return new OtherIncomeAddBackTypeNodeRuleProvider_Factory(
        otherIncomeAddBackTypeNodeRuleProviderMembersInjector);
  }
}
