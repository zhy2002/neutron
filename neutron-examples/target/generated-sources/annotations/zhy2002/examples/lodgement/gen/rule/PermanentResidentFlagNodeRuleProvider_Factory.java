package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PermanentResidentFlagNodeRuleProvider_Factory
    implements Factory<PermanentResidentFlagNodeRuleProvider> {
  private final MembersInjector<PermanentResidentFlagNodeRuleProvider>
      permanentResidentFlagNodeRuleProviderMembersInjector;

  public PermanentResidentFlagNodeRuleProvider_Factory(
      MembersInjector<PermanentResidentFlagNodeRuleProvider>
          permanentResidentFlagNodeRuleProviderMembersInjector) {
    assert permanentResidentFlagNodeRuleProviderMembersInjector != null;
    this.permanentResidentFlagNodeRuleProviderMembersInjector =
        permanentResidentFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public PermanentResidentFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        permanentResidentFlagNodeRuleProviderMembersInjector,
        new PermanentResidentFlagNodeRuleProvider());
  }

  public static Factory<PermanentResidentFlagNodeRuleProvider> create(
      MembersInjector<PermanentResidentFlagNodeRuleProvider>
          permanentResidentFlagNodeRuleProviderMembersInjector) {
    return new PermanentResidentFlagNodeRuleProvider_Factory(
        permanentResidentFlagNodeRuleProviderMembersInjector);
  }
}
