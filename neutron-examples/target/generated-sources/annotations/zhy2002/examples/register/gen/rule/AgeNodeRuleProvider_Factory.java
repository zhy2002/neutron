package zhy2002.examples.register.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AgeNodeRuleProvider_Factory implements Factory<AgeNodeRuleProvider> {
  private final MembersInjector<AgeNodeRuleProvider> ageNodeRuleProviderMembersInjector;

  public AgeNodeRuleProvider_Factory(
      MembersInjector<AgeNodeRuleProvider> ageNodeRuleProviderMembersInjector) {
    assert ageNodeRuleProviderMembersInjector != null;
    this.ageNodeRuleProviderMembersInjector = ageNodeRuleProviderMembersInjector;
  }

  @Override
  public AgeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        ageNodeRuleProviderMembersInjector, new AgeNodeRuleProvider());
  }

  public static Factory<AgeNodeRuleProvider> create(
      MembersInjector<AgeNodeRuleProvider> ageNodeRuleProviderMembersInjector) {
    return new AgeNodeRuleProvider_Factory(ageNodeRuleProviderMembersInjector);
  }
}
