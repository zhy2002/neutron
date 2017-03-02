package zhy2002.examples.register.gen.rule;

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
public final class RegisterNodeRuleProvider_MembersInjector
    implements MembersInjector<RegisterNodeRuleProvider> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<ObjectValueRequiredValidationRule>
      objectValueRequiredValidationRuleProvider;

  private final Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider;

  private final Provider<SetHasErrorRule> setHasErrorRuleProvider;

  private final Provider<CreateErrorNodeRule> createErrorNodeRuleProvider;

  public RegisterNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider,
      Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider,
      Provider<SetHasErrorRule> setHasErrorRuleProvider,
      Provider<CreateErrorNodeRule> createErrorNodeRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
    assert objectValueRequiredValidationRuleProvider != null;
    this.objectValueRequiredValidationRuleProvider = objectValueRequiredValidationRuleProvider;
    assert updateObjectHasValueRuleProvider != null;
    this.updateObjectHasValueRuleProvider = updateObjectHasValueRuleProvider;
    assert setHasErrorRuleProvider != null;
    this.setHasErrorRuleProvider = setHasErrorRuleProvider;
    assert createErrorNodeRuleProvider != null;
    this.createErrorNodeRuleProvider = createErrorNodeRuleProvider;
  }

  public static MembersInjector<RegisterNodeRuleProvider> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider,
      Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider,
      Provider<SetHasErrorRule> setHasErrorRuleProvider,
      Provider<CreateErrorNodeRule> createErrorNodeRuleProvider) {
    return new RegisterNodeRuleProvider_MembersInjector(
        clearErrorsForDisabledNodeRuleProvider,
        objectValueRequiredValidationRuleProvider,
        updateObjectHasValueRuleProvider,
        setHasErrorRuleProvider,
        createErrorNodeRuleProvider);
  }

  @Override
  public void injectMembers(RegisterNodeRuleProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    zhy2002.neutron.UiNodeRuleProvider_MembersInjector.injectClearErrorsForDisabledNodeRuleProvider(
        instance, clearErrorsForDisabledNodeRuleProvider);
    zhy2002.neutron.ObjectUiNodeRuleProvider_MembersInjector
        .injectObjectValueRequiredValidationRuleProvider(
            instance, objectValueRequiredValidationRuleProvider);
    zhy2002.neutron.ObjectUiNodeRuleProvider_MembersInjector.injectUpdateObjectHasValueRuleProvider(
        instance, updateObjectHasValueRuleProvider);
    instance.setHasErrorRuleProvider = setHasErrorRuleProvider;
    instance.createErrorNodeRuleProvider = createErrorNodeRuleProvider;
  }

  public static void injectSetHasErrorRuleProvider(
      RegisterNodeRuleProvider instance, Provider<SetHasErrorRule> setHasErrorRuleProvider) {
    instance.setHasErrorRuleProvider = setHasErrorRuleProvider;
  }

  public static void injectCreateErrorNodeRuleProvider(
      RegisterNodeRuleProvider instance,
      Provider<CreateErrorNodeRule> createErrorNodeRuleProvider) {
    instance.createErrorNodeRuleProvider = createErrorNodeRuleProvider;
  }
}
