package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PreviousEmploymentListNodeRuleProvider_Factory
    implements Factory<PreviousEmploymentListNodeRuleProvider> {
  private final MembersInjector<PreviousEmploymentListNodeRuleProvider>
      previousEmploymentListNodeRuleProviderMembersInjector;

  public PreviousEmploymentListNodeRuleProvider_Factory(
      MembersInjector<PreviousEmploymentListNodeRuleProvider>
          previousEmploymentListNodeRuleProviderMembersInjector) {
    assert previousEmploymentListNodeRuleProviderMembersInjector != null;
    this.previousEmploymentListNodeRuleProviderMembersInjector =
        previousEmploymentListNodeRuleProviderMembersInjector;
  }

  @Override
  public PreviousEmploymentListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        previousEmploymentListNodeRuleProviderMembersInjector,
        new PreviousEmploymentListNodeRuleProvider());
  }

  public static Factory<PreviousEmploymentListNodeRuleProvider> create(
      MembersInjector<PreviousEmploymentListNodeRuleProvider>
          previousEmploymentListNodeRuleProviderMembersInjector) {
    return new PreviousEmploymentListNodeRuleProvider_Factory(
        previousEmploymentListNodeRuleProviderMembersInjector);
  }
}
