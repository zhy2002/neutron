package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContractPriceNodeRuleProvider_Factory
    implements Factory<ContractPriceNodeRuleProvider> {
  private final MembersInjector<ContractPriceNodeRuleProvider>
      contractPriceNodeRuleProviderMembersInjector;

  public ContractPriceNodeRuleProvider_Factory(
      MembersInjector<ContractPriceNodeRuleProvider> contractPriceNodeRuleProviderMembersInjector) {
    assert contractPriceNodeRuleProviderMembersInjector != null;
    this.contractPriceNodeRuleProviderMembersInjector =
        contractPriceNodeRuleProviderMembersInjector;
  }

  @Override
  public ContractPriceNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        contractPriceNodeRuleProviderMembersInjector, new ContractPriceNodeRuleProvider());
  }

  public static Factory<ContractPriceNodeRuleProvider> create(
      MembersInjector<ContractPriceNodeRuleProvider> contractPriceNodeRuleProviderMembersInjector) {
    return new ContractPriceNodeRuleProvider_Factory(contractPriceNodeRuleProviderMembersInjector);
  }
}
