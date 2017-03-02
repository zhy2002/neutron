package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LegalActionNodeRuleProvider_Factory
    implements Factory<LegalActionNodeRuleProvider> {
  private final MembersInjector<LegalActionNodeRuleProvider>
      legalActionNodeRuleProviderMembersInjector;

  public LegalActionNodeRuleProvider_Factory(
      MembersInjector<LegalActionNodeRuleProvider> legalActionNodeRuleProviderMembersInjector) {
    assert legalActionNodeRuleProviderMembersInjector != null;
    this.legalActionNodeRuleProviderMembersInjector = legalActionNodeRuleProviderMembersInjector;
  }

  @Override
  public LegalActionNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        legalActionNodeRuleProviderMembersInjector, new LegalActionNodeRuleProvider());
  }

  public static Factory<LegalActionNodeRuleProvider> create(
      MembersInjector<LegalActionNodeRuleProvider> legalActionNodeRuleProviderMembersInjector) {
    return new LegalActionNodeRuleProvider_Factory(legalActionNodeRuleProviderMembersInjector);
  }
}
