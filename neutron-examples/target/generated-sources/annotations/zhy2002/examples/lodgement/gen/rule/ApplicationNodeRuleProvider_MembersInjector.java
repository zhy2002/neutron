package zhy2002.examples.lodgement.gen.rule;

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
public final class ApplicationNodeRuleProvider_MembersInjector
    implements MembersInjector<ApplicationNodeRuleProvider> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<ObjectValueRequiredValidationRule>
      objectValueRequiredValidationRuleProvider;

  private final Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider;

  private final Provider<CreateErrorNodeRule> createErrorNodeRuleProvider;

  private final Provider<ShowErrorListRule> showErrorListRuleProvider;

  public ApplicationNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider,
      Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider,
      Provider<CreateErrorNodeRule> createErrorNodeRuleProvider,
      Provider<ShowErrorListRule> showErrorListRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
    assert objectValueRequiredValidationRuleProvider != null;
    this.objectValueRequiredValidationRuleProvider = objectValueRequiredValidationRuleProvider;
    assert updateObjectHasValueRuleProvider != null;
    this.updateObjectHasValueRuleProvider = updateObjectHasValueRuleProvider;
    assert createErrorNodeRuleProvider != null;
    this.createErrorNodeRuleProvider = createErrorNodeRuleProvider;
    assert showErrorListRuleProvider != null;
    this.showErrorListRuleProvider = showErrorListRuleProvider;
  }

  public static MembersInjector<ApplicationNodeRuleProvider> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider,
      Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider,
      Provider<CreateErrorNodeRule> createErrorNodeRuleProvider,
      Provider<ShowErrorListRule> showErrorListRuleProvider) {
    return new ApplicationNodeRuleProvider_MembersInjector(
        clearErrorsForDisabledNodeRuleProvider,
        objectValueRequiredValidationRuleProvider,
        updateObjectHasValueRuleProvider,
        createErrorNodeRuleProvider,
        showErrorListRuleProvider);
  }

  @Override
  public void injectMembers(ApplicationNodeRuleProvider instance) {
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
    instance.createErrorNodeRuleProvider = createErrorNodeRuleProvider;
    instance.showErrorListRuleProvider = showErrorListRuleProvider;
  }

  public static void injectCreateErrorNodeRuleProvider(
      ApplicationNodeRuleProvider instance,
      Provider<CreateErrorNodeRule> createErrorNodeRuleProvider) {
    instance.createErrorNodeRuleProvider = createErrorNodeRuleProvider;
  }

  public static void injectShowErrorListRuleProvider(
      ApplicationNodeRuleProvider instance, Provider<ShowErrorListRule> showErrorListRuleProvider) {
    instance.showErrorListRuleProvider = showErrorListRuleProvider;
  }
}
