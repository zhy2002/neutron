package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeTypeNodeRuleProvider_Factory
    implements Factory<OtherIncomeTypeNodeRuleProvider> {
  private final MembersInjector<OtherIncomeTypeNodeRuleProvider>
      otherIncomeTypeNodeRuleProviderMembersInjector;

  public OtherIncomeTypeNodeRuleProvider_Factory(
      MembersInjector<OtherIncomeTypeNodeRuleProvider>
          otherIncomeTypeNodeRuleProviderMembersInjector) {
    assert otherIncomeTypeNodeRuleProviderMembersInjector != null;
    this.otherIncomeTypeNodeRuleProviderMembersInjector =
        otherIncomeTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public OtherIncomeTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        otherIncomeTypeNodeRuleProviderMembersInjector, new OtherIncomeTypeNodeRuleProvider());
  }

  public static Factory<OtherIncomeTypeNodeRuleProvider> create(
      MembersInjector<OtherIncomeTypeNodeRuleProvider>
          otherIncomeTypeNodeRuleProviderMembersInjector) {
    return new OtherIncomeTypeNodeRuleProvider_Factory(
        otherIncomeTypeNodeRuleProviderMembersInjector);
  }
}
