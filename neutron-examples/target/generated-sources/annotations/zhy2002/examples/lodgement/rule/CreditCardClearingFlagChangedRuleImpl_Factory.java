package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.CreditCardClearingFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardClearingFlagChangedRuleImpl_Factory
    implements Factory<CreditCardClearingFlagChangedRuleImpl> {
  private final MembersInjector<CreditCardClearingFlagChangedRuleImpl>
      creditCardClearingFlagChangedRuleImplMembersInjector;

  private final Provider<CreditCardClearingFlagNode> ownerProvider;

  public CreditCardClearingFlagChangedRuleImpl_Factory(
      MembersInjector<CreditCardClearingFlagChangedRuleImpl>
          creditCardClearingFlagChangedRuleImplMembersInjector,
      Provider<CreditCardClearingFlagNode> ownerProvider) {
    assert creditCardClearingFlagChangedRuleImplMembersInjector != null;
    this.creditCardClearingFlagChangedRuleImplMembersInjector =
        creditCardClearingFlagChangedRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public CreditCardClearingFlagChangedRuleImpl get() {
    return MembersInjectors.injectMembers(
        creditCardClearingFlagChangedRuleImplMembersInjector,
        new CreditCardClearingFlagChangedRuleImpl(ownerProvider.get()));
  }

  public static Factory<CreditCardClearingFlagChangedRuleImpl> create(
      MembersInjector<CreditCardClearingFlagChangedRuleImpl>
          creditCardClearingFlagChangedRuleImplMembersInjector,
      Provider<CreditCardClearingFlagNode> ownerProvider) {
    return new CreditCardClearingFlagChangedRuleImpl_Factory(
        creditCardClearingFlagChangedRuleImplMembersInjector, ownerProvider);
  }
}
