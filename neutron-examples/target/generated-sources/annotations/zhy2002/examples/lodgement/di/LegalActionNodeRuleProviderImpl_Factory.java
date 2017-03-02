package zhy2002.examples.lodgement.di;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LegalActionNodeRuleProviderImpl_Factory
    implements Factory<LegalActionNodeRuleProviderImpl> {
  private final MembersInjector<LegalActionNodeRuleProviderImpl>
      legalActionNodeRuleProviderImplMembersInjector;

  public LegalActionNodeRuleProviderImpl_Factory(
      MembersInjector<LegalActionNodeRuleProviderImpl>
          legalActionNodeRuleProviderImplMembersInjector) {
    assert legalActionNodeRuleProviderImplMembersInjector != null;
    this.legalActionNodeRuleProviderImplMembersInjector =
        legalActionNodeRuleProviderImplMembersInjector;
  }

  @Override
  public LegalActionNodeRuleProviderImpl get() {
    return MembersInjectors.injectMembers(
        legalActionNodeRuleProviderImplMembersInjector, new LegalActionNodeRuleProviderImpl());
  }

  public static Factory<LegalActionNodeRuleProviderImpl> create(
      MembersInjector<LegalActionNodeRuleProviderImpl>
          legalActionNodeRuleProviderImplMembersInjector) {
    return new LegalActionNodeRuleProviderImpl_Factory(
        legalActionNodeRuleProviderImplMembersInjector);
  }
}
