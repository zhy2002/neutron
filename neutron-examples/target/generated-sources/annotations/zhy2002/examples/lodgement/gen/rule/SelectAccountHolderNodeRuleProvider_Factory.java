package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectAccountHolderNodeRuleProvider_Factory
    implements Factory<SelectAccountHolderNodeRuleProvider> {
  private final MembersInjector<SelectAccountHolderNodeRuleProvider>
      selectAccountHolderNodeRuleProviderMembersInjector;

  public SelectAccountHolderNodeRuleProvider_Factory(
      MembersInjector<SelectAccountHolderNodeRuleProvider>
          selectAccountHolderNodeRuleProviderMembersInjector) {
    assert selectAccountHolderNodeRuleProviderMembersInjector != null;
    this.selectAccountHolderNodeRuleProviderMembersInjector =
        selectAccountHolderNodeRuleProviderMembersInjector;
  }

  @Override
  public SelectAccountHolderNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        selectAccountHolderNodeRuleProviderMembersInjector,
        new SelectAccountHolderNodeRuleProvider());
  }

  public static Factory<SelectAccountHolderNodeRuleProvider> create(
      MembersInjector<SelectAccountHolderNodeRuleProvider>
          selectAccountHolderNodeRuleProviderMembersInjector) {
    return new SelectAccountHolderNodeRuleProvider_Factory(
        selectAccountHolderNodeRuleProviderMembersInjector);
  }
}
