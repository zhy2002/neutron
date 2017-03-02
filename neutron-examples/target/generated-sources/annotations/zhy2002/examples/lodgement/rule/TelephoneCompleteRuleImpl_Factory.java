package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.TelephoneNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TelephoneCompleteRuleImpl_Factory implements Factory<TelephoneCompleteRuleImpl> {
  private final MembersInjector<TelephoneCompleteRuleImpl> telephoneCompleteRuleImplMembersInjector;

  private final Provider<TelephoneNode<?>> ownerProvider;

  public TelephoneCompleteRuleImpl_Factory(
      MembersInjector<TelephoneCompleteRuleImpl> telephoneCompleteRuleImplMembersInjector,
      Provider<TelephoneNode<?>> ownerProvider) {
    assert telephoneCompleteRuleImplMembersInjector != null;
    this.telephoneCompleteRuleImplMembersInjector = telephoneCompleteRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public TelephoneCompleteRuleImpl get() {
    return MembersInjectors.injectMembers(
        telephoneCompleteRuleImplMembersInjector,
        new TelephoneCompleteRuleImpl(ownerProvider.get()));
  }

  public static Factory<TelephoneCompleteRuleImpl> create(
      MembersInjector<TelephoneCompleteRuleImpl> telephoneCompleteRuleImplMembersInjector,
      Provider<TelephoneNode<?>> ownerProvider) {
    return new TelephoneCompleteRuleImpl_Factory(
        telephoneCompleteRuleImplMembersInjector, ownerProvider);
  }
}
