package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetiredEmploymentNodeRuleProvider_Factory
    implements Factory<RetiredEmploymentNodeRuleProvider> {
  private final MembersInjector<RetiredEmploymentNodeRuleProvider>
      retiredEmploymentNodeRuleProviderMembersInjector;

  public RetiredEmploymentNodeRuleProvider_Factory(
      MembersInjector<RetiredEmploymentNodeRuleProvider>
          retiredEmploymentNodeRuleProviderMembersInjector) {
    assert retiredEmploymentNodeRuleProviderMembersInjector != null;
    this.retiredEmploymentNodeRuleProviderMembersInjector =
        retiredEmploymentNodeRuleProviderMembersInjector;
  }

  @Override
  public RetiredEmploymentNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        retiredEmploymentNodeRuleProviderMembersInjector, new RetiredEmploymentNodeRuleProvider());
  }

  public static Factory<RetiredEmploymentNodeRuleProvider> create(
      MembersInjector<RetiredEmploymentNodeRuleProvider>
          retiredEmploymentNodeRuleProviderMembersInjector) {
    return new RetiredEmploymentNodeRuleProvider_Factory(
        retiredEmploymentNodeRuleProviderMembersInjector);
  }
}
