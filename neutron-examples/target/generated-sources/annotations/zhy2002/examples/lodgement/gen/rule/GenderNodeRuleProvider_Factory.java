package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GenderNodeRuleProvider_Factory implements Factory<GenderNodeRuleProvider> {
  private final MembersInjector<GenderNodeRuleProvider> genderNodeRuleProviderMembersInjector;

  public GenderNodeRuleProvider_Factory(
      MembersInjector<GenderNodeRuleProvider> genderNodeRuleProviderMembersInjector) {
    assert genderNodeRuleProviderMembersInjector != null;
    this.genderNodeRuleProviderMembersInjector = genderNodeRuleProviderMembersInjector;
  }

  @Override
  public GenderNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        genderNodeRuleProviderMembersInjector, new GenderNodeRuleProvider());
  }

  public static Factory<GenderNodeRuleProvider> create(
      MembersInjector<GenderNodeRuleProvider> genderNodeRuleProviderMembersInjector) {
    return new GenderNodeRuleProvider_Factory(genderNodeRuleProviderMembersInjector);
  }
}
