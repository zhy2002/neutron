package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EstimatedMarketValueNodeRuleProvider_Factory
    implements Factory<EstimatedMarketValueNodeRuleProvider> {
  private final MembersInjector<EstimatedMarketValueNodeRuleProvider>
      estimatedMarketValueNodeRuleProviderMembersInjector;

  public EstimatedMarketValueNodeRuleProvider_Factory(
      MembersInjector<EstimatedMarketValueNodeRuleProvider>
          estimatedMarketValueNodeRuleProviderMembersInjector) {
    assert estimatedMarketValueNodeRuleProviderMembersInjector != null;
    this.estimatedMarketValueNodeRuleProviderMembersInjector =
        estimatedMarketValueNodeRuleProviderMembersInjector;
  }

  @Override
  public EstimatedMarketValueNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        estimatedMarketValueNodeRuleProviderMembersInjector,
        new EstimatedMarketValueNodeRuleProvider());
  }

  public static Factory<EstimatedMarketValueNodeRuleProvider> create(
      MembersInjector<EstimatedMarketValueNodeRuleProvider>
          estimatedMarketValueNodeRuleProviderMembersInjector) {
    return new EstimatedMarketValueNodeRuleProvider_Factory(
        estimatedMarketValueNodeRuleProviderMembersInjector);
  }
}
