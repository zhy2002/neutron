package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectRelatedPersonNodeRuleProvider_Factory
    implements Factory<SelectRelatedPersonNodeRuleProvider> {
  private final MembersInjector<SelectRelatedPersonNodeRuleProvider>
      selectRelatedPersonNodeRuleProviderMembersInjector;

  public SelectRelatedPersonNodeRuleProvider_Factory(
      MembersInjector<SelectRelatedPersonNodeRuleProvider>
          selectRelatedPersonNodeRuleProviderMembersInjector) {
    assert selectRelatedPersonNodeRuleProviderMembersInjector != null;
    this.selectRelatedPersonNodeRuleProviderMembersInjector =
        selectRelatedPersonNodeRuleProviderMembersInjector;
  }

  @Override
  public SelectRelatedPersonNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        selectRelatedPersonNodeRuleProviderMembersInjector,
        new SelectRelatedPersonNodeRuleProvider());
  }

  public static Factory<SelectRelatedPersonNodeRuleProvider> create(
      MembersInjector<SelectRelatedPersonNodeRuleProvider>
          selectRelatedPersonNodeRuleProviderMembersInjector) {
    return new SelectRelatedPersonNodeRuleProvider_Factory(
        selectRelatedPersonNodeRuleProviderMembersInjector);
  }
}
