package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AdditionalNodeRuleProvider_Factory
    implements Factory<AdditionalNodeRuleProvider> {
  private final MembersInjector<AdditionalNodeRuleProvider>
      additionalNodeRuleProviderMembersInjector;

  public AdditionalNodeRuleProvider_Factory(
      MembersInjector<AdditionalNodeRuleProvider> additionalNodeRuleProviderMembersInjector) {
    assert additionalNodeRuleProviderMembersInjector != null;
    this.additionalNodeRuleProviderMembersInjector = additionalNodeRuleProviderMembersInjector;
  }

  @Override
  public AdditionalNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        additionalNodeRuleProviderMembersInjector, new AdditionalNodeRuleProvider());
  }

  public static Factory<AdditionalNodeRuleProvider> create(
      MembersInjector<AdditionalNodeRuleProvider> additionalNodeRuleProviderMembersInjector) {
    return new AdditionalNodeRuleProvider_Factory(additionalNodeRuleProviderMembersInjector);
  }
}
