package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelfEmployedNodeRuleProvider_Factory
    implements Factory<SelfEmployedNodeRuleProvider> {
  private final MembersInjector<SelfEmployedNodeRuleProvider>
      selfEmployedNodeRuleProviderMembersInjector;

  public SelfEmployedNodeRuleProvider_Factory(
      MembersInjector<SelfEmployedNodeRuleProvider> selfEmployedNodeRuleProviderMembersInjector) {
    assert selfEmployedNodeRuleProviderMembersInjector != null;
    this.selfEmployedNodeRuleProviderMembersInjector = selfEmployedNodeRuleProviderMembersInjector;
  }

  @Override
  public SelfEmployedNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        selfEmployedNodeRuleProviderMembersInjector, new SelfEmployedNodeRuleProvider());
  }

  public static Factory<SelfEmployedNodeRuleProvider> create(
      MembersInjector<SelfEmployedNodeRuleProvider> selfEmployedNodeRuleProviderMembersInjector) {
    return new SelfEmployedNodeRuleProvider_Factory(selfEmployedNodeRuleProviderMembersInjector);
  }
}
