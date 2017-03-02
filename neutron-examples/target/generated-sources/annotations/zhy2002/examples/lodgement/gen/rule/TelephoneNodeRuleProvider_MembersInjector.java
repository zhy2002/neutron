package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.TelephoneNode;
import zhy2002.neutron.rule.ClearErrorsForDisabledNodeRule;
import zhy2002.neutron.rule.LeafValueRequiredValidationRule;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TelephoneNodeRuleProvider_MembersInjector<N extends TelephoneNode<?>>
    implements MembersInjector<TelephoneNodeRuleProvider<N>> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

  private final Provider<TelephoneCompleteRule> telephoneCompleteRuleProvider;

  public TelephoneNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<TelephoneCompleteRule> telephoneCompleteRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
    assert leafValueRequiredValidationRuleProvider != null;
    this.leafValueRequiredValidationRuleProvider = leafValueRequiredValidationRuleProvider;
    assert telephoneCompleteRuleProvider != null;
    this.telephoneCompleteRuleProvider = telephoneCompleteRuleProvider;
  }

  public static <N extends TelephoneNode<?>> MembersInjector<TelephoneNodeRuleProvider<N>> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<TelephoneCompleteRule> telephoneCompleteRuleProvider) {
    return new TelephoneNodeRuleProvider_MembersInjector<N>(
        clearErrorsForDisabledNodeRuleProvider,
        leafValueRequiredValidationRuleProvider,
        telephoneCompleteRuleProvider);
  }

  @Override
  public void injectMembers(TelephoneNodeRuleProvider<N> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    zhy2002.neutron.UiNodeRuleProvider_MembersInjector.injectClearErrorsForDisabledNodeRuleProvider(
        instance, clearErrorsForDisabledNodeRuleProvider);
    zhy2002.neutron.LeafUiNodeRuleProvider_MembersInjector
        .injectLeafValueRequiredValidationRuleProvider(
            instance, leafValueRequiredValidationRuleProvider);
    instance.telephoneCompleteRuleProvider = telephoneCompleteRuleProvider;
  }

  public static <N extends TelephoneNode<?>> void injectTelephoneCompleteRuleProvider(
      TelephoneNodeRuleProvider<N> instance,
      Provider<TelephoneCompleteRule> telephoneCompleteRuleProvider) {
    instance.telephoneCompleteRuleProvider = telephoneCompleteRuleProvider;
  }
}
