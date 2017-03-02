package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PreviousEmploymentNodeRuleProvider_Factory
    implements Factory<PreviousEmploymentNodeRuleProvider> {
  private final MembersInjector<PreviousEmploymentNodeRuleProvider>
      previousEmploymentNodeRuleProviderMembersInjector;

  public PreviousEmploymentNodeRuleProvider_Factory(
      MembersInjector<PreviousEmploymentNodeRuleProvider>
          previousEmploymentNodeRuleProviderMembersInjector) {
    assert previousEmploymentNodeRuleProviderMembersInjector != null;
    this.previousEmploymentNodeRuleProviderMembersInjector =
        previousEmploymentNodeRuleProviderMembersInjector;
  }

  @Override
  public PreviousEmploymentNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        previousEmploymentNodeRuleProviderMembersInjector,
        new PreviousEmploymentNodeRuleProvider());
  }

  public static Factory<PreviousEmploymentNodeRuleProvider> create(
      MembersInjector<PreviousEmploymentNodeRuleProvider>
          previousEmploymentNodeRuleProviderMembersInjector) {
    return new PreviousEmploymentNodeRuleProvider_Factory(
        previousEmploymentNodeRuleProviderMembersInjector);
  }
}
