package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeNodeRuleProvider_Factory
    implements Factory<OtherIncomeNodeRuleProvider> {
  private final MembersInjector<OtherIncomeNodeRuleProvider>
      otherIncomeNodeRuleProviderMembersInjector;

  public OtherIncomeNodeRuleProvider_Factory(
      MembersInjector<OtherIncomeNodeRuleProvider> otherIncomeNodeRuleProviderMembersInjector) {
    assert otherIncomeNodeRuleProviderMembersInjector != null;
    this.otherIncomeNodeRuleProviderMembersInjector = otherIncomeNodeRuleProviderMembersInjector;
  }

  @Override
  public OtherIncomeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        otherIncomeNodeRuleProviderMembersInjector, new OtherIncomeNodeRuleProvider());
  }

  public static Factory<OtherIncomeNodeRuleProvider> create(
      MembersInjector<OtherIncomeNodeRuleProvider> otherIncomeNodeRuleProviderMembersInjector) {
    return new OtherIncomeNodeRuleProvider_Factory(otherIncomeNodeRuleProviderMembersInjector);
  }
}
