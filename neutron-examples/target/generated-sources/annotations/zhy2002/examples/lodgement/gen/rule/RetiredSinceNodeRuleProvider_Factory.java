package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetiredSinceNodeRuleProvider_Factory
    implements Factory<RetiredSinceNodeRuleProvider> {
  private final MembersInjector<RetiredSinceNodeRuleProvider>
      retiredSinceNodeRuleProviderMembersInjector;

  public RetiredSinceNodeRuleProvider_Factory(
      MembersInjector<RetiredSinceNodeRuleProvider> retiredSinceNodeRuleProviderMembersInjector) {
    assert retiredSinceNodeRuleProviderMembersInjector != null;
    this.retiredSinceNodeRuleProviderMembersInjector = retiredSinceNodeRuleProviderMembersInjector;
  }

  @Override
  public RetiredSinceNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        retiredSinceNodeRuleProviderMembersInjector, new RetiredSinceNodeRuleProvider());
  }

  public static Factory<RetiredSinceNodeRuleProvider> create(
      MembersInjector<RetiredSinceNodeRuleProvider> retiredSinceNodeRuleProviderMembersInjector) {
    return new RetiredSinceNodeRuleProvider_Factory(retiredSinceNodeRuleProviderMembersInjector);
  }
}
