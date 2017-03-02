package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PrimarySecurityFlagNodeRuleProvider_Factory
    implements Factory<PrimarySecurityFlagNodeRuleProvider> {
  private final MembersInjector<PrimarySecurityFlagNodeRuleProvider>
      primarySecurityFlagNodeRuleProviderMembersInjector;

  public PrimarySecurityFlagNodeRuleProvider_Factory(
      MembersInjector<PrimarySecurityFlagNodeRuleProvider>
          primarySecurityFlagNodeRuleProviderMembersInjector) {
    assert primarySecurityFlagNodeRuleProviderMembersInjector != null;
    this.primarySecurityFlagNodeRuleProviderMembersInjector =
        primarySecurityFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public PrimarySecurityFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        primarySecurityFlagNodeRuleProviderMembersInjector,
        new PrimarySecurityFlagNodeRuleProvider());
  }

  public static Factory<PrimarySecurityFlagNodeRuleProvider> create(
      MembersInjector<PrimarySecurityFlagNodeRuleProvider>
          primarySecurityFlagNodeRuleProviderMembersInjector) {
    return new PrimarySecurityFlagNodeRuleProvider_Factory(
        primarySecurityFlagNodeRuleProviderMembersInjector);
  }
}
