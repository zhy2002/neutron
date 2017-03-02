package zhy2002.neutron;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.rule.ClearErrorsForDisabledNodeRule;
import zhy2002.neutron.rule.ObjectValueRequiredValidationRule;
import zhy2002.neutron.rule.UpdateObjectHasValueRule;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ObjectUiNodeRuleProvider_MembersInjector<N extends ObjectUiNode<?>>
    implements MembersInjector<ObjectUiNodeRuleProvider<N>> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<ObjectValueRequiredValidationRule>
      objectValueRequiredValidationRuleProvider;

  private final Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider;

  public ObjectUiNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider,
      Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
    assert objectValueRequiredValidationRuleProvider != null;
    this.objectValueRequiredValidationRuleProvider = objectValueRequiredValidationRuleProvider;
    assert updateObjectHasValueRuleProvider != null;
    this.updateObjectHasValueRuleProvider = updateObjectHasValueRuleProvider;
  }

  public static <N extends ObjectUiNode<?>> MembersInjector<ObjectUiNodeRuleProvider<N>> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider,
      Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider) {
    return new ObjectUiNodeRuleProvider_MembersInjector<N>(
        clearErrorsForDisabledNodeRuleProvider,
        objectValueRequiredValidationRuleProvider,
        updateObjectHasValueRuleProvider);
  }

  @Override
  public void injectMembers(ObjectUiNodeRuleProvider<N> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((UiNodeRuleProvider) instance).clearErrorsForDisabledNodeRuleProvider =
        clearErrorsForDisabledNodeRuleProvider;
    instance.objectValueRequiredValidationRuleProvider = objectValueRequiredValidationRuleProvider;
    instance.updateObjectHasValueRuleProvider = updateObjectHasValueRuleProvider;
  }

  public static <N extends ObjectUiNode<?>> void injectObjectValueRequiredValidationRuleProvider(
      ObjectUiNodeRuleProvider<N> instance,
      Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider) {
    instance.objectValueRequiredValidationRuleProvider = objectValueRequiredValidationRuleProvider;
  }

  public static <N extends ObjectUiNode<?>> void injectUpdateObjectHasValueRuleProvider(
      ObjectUiNodeRuleProvider<N> instance,
      Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider) {
    instance.updateObjectHasValueRuleProvider = updateObjectHasValueRuleProvider;
  }
}
