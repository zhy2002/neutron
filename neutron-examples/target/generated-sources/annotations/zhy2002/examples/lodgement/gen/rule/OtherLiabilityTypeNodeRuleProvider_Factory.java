package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityTypeNodeRuleProvider_Factory
    implements Factory<OtherLiabilityTypeNodeRuleProvider> {
  private final MembersInjector<OtherLiabilityTypeNodeRuleProvider>
      otherLiabilityTypeNodeRuleProviderMembersInjector;

  public OtherLiabilityTypeNodeRuleProvider_Factory(
      MembersInjector<OtherLiabilityTypeNodeRuleProvider>
          otherLiabilityTypeNodeRuleProviderMembersInjector) {
    assert otherLiabilityTypeNodeRuleProviderMembersInjector != null;
    this.otherLiabilityTypeNodeRuleProviderMembersInjector =
        otherLiabilityTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public OtherLiabilityTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        otherLiabilityTypeNodeRuleProviderMembersInjector,
        new OtherLiabilityTypeNodeRuleProvider());
  }

  public static Factory<OtherLiabilityTypeNodeRuleProvider> create(
      MembersInjector<OtherLiabilityTypeNodeRuleProvider>
          otherLiabilityTypeNodeRuleProviderMembersInjector) {
    return new OtherLiabilityTypeNodeRuleProvider_Factory(
        otherLiabilityTypeNodeRuleProviderMembersInjector);
  }
}
