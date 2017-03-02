package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityDescriptionNodeRuleProvider_Factory
    implements Factory<OtherLiabilityDescriptionNodeRuleProvider> {
  private final MembersInjector<OtherLiabilityDescriptionNodeRuleProvider>
      otherLiabilityDescriptionNodeRuleProviderMembersInjector;

  public OtherLiabilityDescriptionNodeRuleProvider_Factory(
      MembersInjector<OtherLiabilityDescriptionNodeRuleProvider>
          otherLiabilityDescriptionNodeRuleProviderMembersInjector) {
    assert otherLiabilityDescriptionNodeRuleProviderMembersInjector != null;
    this.otherLiabilityDescriptionNodeRuleProviderMembersInjector =
        otherLiabilityDescriptionNodeRuleProviderMembersInjector;
  }

  @Override
  public OtherLiabilityDescriptionNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        otherLiabilityDescriptionNodeRuleProviderMembersInjector,
        new OtherLiabilityDescriptionNodeRuleProvider());
  }

  public static Factory<OtherLiabilityDescriptionNodeRuleProvider> create(
      MembersInjector<OtherLiabilityDescriptionNodeRuleProvider>
          otherLiabilityDescriptionNodeRuleProviderMembersInjector) {
    return new OtherLiabilityDescriptionNodeRuleProvider_Factory(
        otherLiabilityDescriptionNodeRuleProviderMembersInjector);
  }
}
