package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FirstHomeBuyerFlagNodeRuleProvider_Factory
    implements Factory<FirstHomeBuyerFlagNodeRuleProvider> {
  private final MembersInjector<FirstHomeBuyerFlagNodeRuleProvider>
      firstHomeBuyerFlagNodeRuleProviderMembersInjector;

  public FirstHomeBuyerFlagNodeRuleProvider_Factory(
      MembersInjector<FirstHomeBuyerFlagNodeRuleProvider>
          firstHomeBuyerFlagNodeRuleProviderMembersInjector) {
    assert firstHomeBuyerFlagNodeRuleProviderMembersInjector != null;
    this.firstHomeBuyerFlagNodeRuleProviderMembersInjector =
        firstHomeBuyerFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public FirstHomeBuyerFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        firstHomeBuyerFlagNodeRuleProviderMembersInjector,
        new FirstHomeBuyerFlagNodeRuleProvider());
  }

  public static Factory<FirstHomeBuyerFlagNodeRuleProvider> create(
      MembersInjector<FirstHomeBuyerFlagNodeRuleProvider>
          firstHomeBuyerFlagNodeRuleProviderMembersInjector) {
    return new FirstHomeBuyerFlagNodeRuleProvider_Factory(
        firstHomeBuyerFlagNodeRuleProviderMembersInjector);
  }
}
