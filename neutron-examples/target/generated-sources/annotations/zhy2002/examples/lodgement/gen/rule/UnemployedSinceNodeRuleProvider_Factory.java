package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UnemployedSinceNodeRuleProvider_Factory
    implements Factory<UnemployedSinceNodeRuleProvider> {
  private final MembersInjector<UnemployedSinceNodeRuleProvider>
      unemployedSinceNodeRuleProviderMembersInjector;

  public UnemployedSinceNodeRuleProvider_Factory(
      MembersInjector<UnemployedSinceNodeRuleProvider>
          unemployedSinceNodeRuleProviderMembersInjector) {
    assert unemployedSinceNodeRuleProviderMembersInjector != null;
    this.unemployedSinceNodeRuleProviderMembersInjector =
        unemployedSinceNodeRuleProviderMembersInjector;
  }

  @Override
  public UnemployedSinceNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        unemployedSinceNodeRuleProviderMembersInjector, new UnemployedSinceNodeRuleProvider());
  }

  public static Factory<UnemployedSinceNodeRuleProvider> create(
      MembersInjector<UnemployedSinceNodeRuleProvider>
          unemployedSinceNodeRuleProviderMembersInjector) {
    return new UnemployedSinceNodeRuleProvider_Factory(
        unemployedSinceNodeRuleProviderMembersInjector);
  }
}
