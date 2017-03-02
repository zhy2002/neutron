package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomePreviousYearNodeRuleProvider_Factory
    implements Factory<OtherIncomePreviousYearNodeRuleProvider> {
  private final MembersInjector<OtherIncomePreviousYearNodeRuleProvider>
      otherIncomePreviousYearNodeRuleProviderMembersInjector;

  public OtherIncomePreviousYearNodeRuleProvider_Factory(
      MembersInjector<OtherIncomePreviousYearNodeRuleProvider>
          otherIncomePreviousYearNodeRuleProviderMembersInjector) {
    assert otherIncomePreviousYearNodeRuleProviderMembersInjector != null;
    this.otherIncomePreviousYearNodeRuleProviderMembersInjector =
        otherIncomePreviousYearNodeRuleProviderMembersInjector;
  }

  @Override
  public OtherIncomePreviousYearNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        otherIncomePreviousYearNodeRuleProviderMembersInjector,
        new OtherIncomePreviousYearNodeRuleProvider());
  }

  public static Factory<OtherIncomePreviousYearNodeRuleProvider> create(
      MembersInjector<OtherIncomePreviousYearNodeRuleProvider>
          otherIncomePreviousYearNodeRuleProviderMembersInjector) {
    return new OtherIncomePreviousYearNodeRuleProvider_Factory(
        otherIncomePreviousYearNodeRuleProviderMembersInjector);
  }
}
