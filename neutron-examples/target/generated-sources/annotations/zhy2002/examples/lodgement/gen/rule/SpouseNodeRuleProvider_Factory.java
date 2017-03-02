package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SpouseNodeRuleProvider_Factory implements Factory<SpouseNodeRuleProvider> {
  private final MembersInjector<SpouseNodeRuleProvider> spouseNodeRuleProviderMembersInjector;

  public SpouseNodeRuleProvider_Factory(
      MembersInjector<SpouseNodeRuleProvider> spouseNodeRuleProviderMembersInjector) {
    assert spouseNodeRuleProviderMembersInjector != null;
    this.spouseNodeRuleProviderMembersInjector = spouseNodeRuleProviderMembersInjector;
  }

  @Override
  public SpouseNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        spouseNodeRuleProviderMembersInjector, new SpouseNodeRuleProvider());
  }

  public static Factory<SpouseNodeRuleProvider> create(
      MembersInjector<SpouseNodeRuleProvider> spouseNodeRuleProviderMembersInjector) {
    return new SpouseNodeRuleProvider_Factory(spouseNodeRuleProviderMembersInjector);
  }
}
