package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeDescriptionNodeRuleProvider_Factory
    implements Factory<OtherIncomeDescriptionNodeRuleProvider> {
  private final MembersInjector<OtherIncomeDescriptionNodeRuleProvider>
      otherIncomeDescriptionNodeRuleProviderMembersInjector;

  public OtherIncomeDescriptionNodeRuleProvider_Factory(
      MembersInjector<OtherIncomeDescriptionNodeRuleProvider>
          otherIncomeDescriptionNodeRuleProviderMembersInjector) {
    assert otherIncomeDescriptionNodeRuleProviderMembersInjector != null;
    this.otherIncomeDescriptionNodeRuleProviderMembersInjector =
        otherIncomeDescriptionNodeRuleProviderMembersInjector;
  }

  @Override
  public OtherIncomeDescriptionNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        otherIncomeDescriptionNodeRuleProviderMembersInjector,
        new OtherIncomeDescriptionNodeRuleProvider());
  }

  public static Factory<OtherIncomeDescriptionNodeRuleProvider> create(
      MembersInjector<OtherIncomeDescriptionNodeRuleProvider>
          otherIncomeDescriptionNodeRuleProviderMembersInjector) {
    return new OtherIncomeDescriptionNodeRuleProvider_Factory(
        otherIncomeDescriptionNodeRuleProviderMembersInjector);
  }
}
