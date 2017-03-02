package zhy2002.examples.app.gen.rule;

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
public final class LodgementNodeRuleProvider_MembersInjector
    implements MembersInjector<LodgementNodeRuleProvider> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<ObjectValueRequiredValidationRule>
      objectValueRequiredValidationRuleProvider;

  private final Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider;

  private final Provider<DummyRule> dummyRuleProvider;

  public LodgementNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider,
      Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider,
      Provider<DummyRule> dummyRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
    assert objectValueRequiredValidationRuleProvider != null;
    this.objectValueRequiredValidationRuleProvider = objectValueRequiredValidationRuleProvider;
    assert updateObjectHasValueRuleProvider != null;
    this.updateObjectHasValueRuleProvider = updateObjectHasValueRuleProvider;
    assert dummyRuleProvider != null;
    this.dummyRuleProvider = dummyRuleProvider;
  }

  public static MembersInjector<LodgementNodeRuleProvider> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider,
      Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider,
      Provider<DummyRule> dummyRuleProvider) {
    return new LodgementNodeRuleProvider_MembersInjector(
        clearErrorsForDisabledNodeRuleProvider,
        objectValueRequiredValidationRuleProvider,
        updateObjectHasValueRuleProvider,
        dummyRuleProvider);
  }

  @Override
  public void injectMembers(LodgementNodeRuleProvider instance) {
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
    instance.dummyRuleProvider = dummyRuleProvider;
  }

  public static void injectDummyRuleProvider(
      LodgementNodeRuleProvider instance, Provider<DummyRule> dummyRuleProvider) {
    instance.dummyRuleProvider = dummyRuleProvider;
  }
}
