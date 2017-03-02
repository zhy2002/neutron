package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectAccountHolderFlagNodeRuleProvider_Factory
    implements Factory<SelectAccountHolderFlagNodeRuleProvider> {
  private final MembersInjector<SelectAccountHolderFlagNodeRuleProvider>
      selectAccountHolderFlagNodeRuleProviderMembersInjector;

  public SelectAccountHolderFlagNodeRuleProvider_Factory(
      MembersInjector<SelectAccountHolderFlagNodeRuleProvider>
          selectAccountHolderFlagNodeRuleProviderMembersInjector) {
    assert selectAccountHolderFlagNodeRuleProviderMembersInjector != null;
    this.selectAccountHolderFlagNodeRuleProviderMembersInjector =
        selectAccountHolderFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public SelectAccountHolderFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        selectAccountHolderFlagNodeRuleProviderMembersInjector,
        new SelectAccountHolderFlagNodeRuleProvider());
  }

  public static Factory<SelectAccountHolderFlagNodeRuleProvider> create(
      MembersInjector<SelectAccountHolderFlagNodeRuleProvider>
          selectAccountHolderFlagNodeRuleProviderMembersInjector) {
    return new SelectAccountHolderFlagNodeRuleProvider_Factory(
        selectAccountHolderFlagNodeRuleProviderMembersInjector);
  }
}
