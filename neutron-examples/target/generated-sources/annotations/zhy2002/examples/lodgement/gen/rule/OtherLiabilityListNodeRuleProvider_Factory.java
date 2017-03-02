package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityListNodeRuleProvider_Factory
    implements Factory<OtherLiabilityListNodeRuleProvider> {
  private final MembersInjector<OtherLiabilityListNodeRuleProvider>
      otherLiabilityListNodeRuleProviderMembersInjector;

  public OtherLiabilityListNodeRuleProvider_Factory(
      MembersInjector<OtherLiabilityListNodeRuleProvider>
          otherLiabilityListNodeRuleProviderMembersInjector) {
    assert otherLiabilityListNodeRuleProviderMembersInjector != null;
    this.otherLiabilityListNodeRuleProviderMembersInjector =
        otherLiabilityListNodeRuleProviderMembersInjector;
  }

  @Override
  public OtherLiabilityListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        otherLiabilityListNodeRuleProviderMembersInjector,
        new OtherLiabilityListNodeRuleProvider());
  }

  public static Factory<OtherLiabilityListNodeRuleProvider> create(
      MembersInjector<OtherLiabilityListNodeRuleProvider>
          otherLiabilityListNodeRuleProviderMembersInjector) {
    return new OtherLiabilityListNodeRuleProvider_Factory(
        otherLiabilityListNodeRuleProviderMembersInjector);
  }
}
