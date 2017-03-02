package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectRelatedPersonFlagNodeRuleProvider_Factory
    implements Factory<SelectRelatedPersonFlagNodeRuleProvider> {
  private final MembersInjector<SelectRelatedPersonFlagNodeRuleProvider>
      selectRelatedPersonFlagNodeRuleProviderMembersInjector;

  public SelectRelatedPersonFlagNodeRuleProvider_Factory(
      MembersInjector<SelectRelatedPersonFlagNodeRuleProvider>
          selectRelatedPersonFlagNodeRuleProviderMembersInjector) {
    assert selectRelatedPersonFlagNodeRuleProviderMembersInjector != null;
    this.selectRelatedPersonFlagNodeRuleProviderMembersInjector =
        selectRelatedPersonFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public SelectRelatedPersonFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        selectRelatedPersonFlagNodeRuleProviderMembersInjector,
        new SelectRelatedPersonFlagNodeRuleProvider());
  }

  public static Factory<SelectRelatedPersonFlagNodeRuleProvider> create(
      MembersInjector<SelectRelatedPersonFlagNodeRuleProvider>
          selectRelatedPersonFlagNodeRuleProviderMembersInjector) {
    return new SelectRelatedPersonFlagNodeRuleProvider_Factory(
        selectRelatedPersonFlagNodeRuleProviderMembersInjector);
  }
}
