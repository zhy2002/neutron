package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustSettlorNotRequiredReasonNodeRuleProvider_Factory
    implements Factory<TrustSettlorNotRequiredReasonNodeRuleProvider> {
  private final MembersInjector<TrustSettlorNotRequiredReasonNodeRuleProvider>
      trustSettlorNotRequiredReasonNodeRuleProviderMembersInjector;

  public TrustSettlorNotRequiredReasonNodeRuleProvider_Factory(
      MembersInjector<TrustSettlorNotRequiredReasonNodeRuleProvider>
          trustSettlorNotRequiredReasonNodeRuleProviderMembersInjector) {
    assert trustSettlorNotRequiredReasonNodeRuleProviderMembersInjector != null;
    this.trustSettlorNotRequiredReasonNodeRuleProviderMembersInjector =
        trustSettlorNotRequiredReasonNodeRuleProviderMembersInjector;
  }

  @Override
  public TrustSettlorNotRequiredReasonNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        trustSettlorNotRequiredReasonNodeRuleProviderMembersInjector,
        new TrustSettlorNotRequiredReasonNodeRuleProvider());
  }

  public static Factory<TrustSettlorNotRequiredReasonNodeRuleProvider> create(
      MembersInjector<TrustSettlorNotRequiredReasonNodeRuleProvider>
          trustSettlorNotRequiredReasonNodeRuleProviderMembersInjector) {
    return new TrustSettlorNotRequiredReasonNodeRuleProvider_Factory(
        trustSettlorNotRequiredReasonNodeRuleProviderMembersInjector);
  }
}
