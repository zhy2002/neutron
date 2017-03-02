package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SuburbNodeRuleProvider_Factory implements Factory<SuburbNodeRuleProvider> {
  private final MembersInjector<SuburbNodeRuleProvider> suburbNodeRuleProviderMembersInjector;

  public SuburbNodeRuleProvider_Factory(
      MembersInjector<SuburbNodeRuleProvider> suburbNodeRuleProviderMembersInjector) {
    assert suburbNodeRuleProviderMembersInjector != null;
    this.suburbNodeRuleProviderMembersInjector = suburbNodeRuleProviderMembersInjector;
  }

  @Override
  public SuburbNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        suburbNodeRuleProviderMembersInjector, new SuburbNodeRuleProvider());
  }

  public static Factory<SuburbNodeRuleProvider> create(
      MembersInjector<SuburbNodeRuleProvider> suburbNodeRuleProviderMembersInjector) {
    return new SuburbNodeRuleProvider_Factory(suburbNodeRuleProviderMembersInjector);
  }
}
