package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.rule.ClearErrorsForDisabledNodeRule;
import zhy2002.neutron.rule.LeafValueRequiredValidationRule;
import zhy2002.neutron.rule.NodeReferenceChangeRule;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RelatedPersonReferenceNodeRuleProvider_MembersInjector
    implements MembersInjector<RelatedPersonReferenceNodeRuleProvider> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

  private final Provider<NodeReferenceChangeRule> nodeReferenceChangeRuleProvider;

  public RelatedPersonReferenceNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<NodeReferenceChangeRule> nodeReferenceChangeRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
    assert leafValueRequiredValidationRuleProvider != null;
    this.leafValueRequiredValidationRuleProvider = leafValueRequiredValidationRuleProvider;
    assert nodeReferenceChangeRuleProvider != null;
    this.nodeReferenceChangeRuleProvider = nodeReferenceChangeRuleProvider;
  }

  public static MembersInjector<RelatedPersonReferenceNodeRuleProvider> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<NodeReferenceChangeRule> nodeReferenceChangeRuleProvider) {
    return new RelatedPersonReferenceNodeRuleProvider_MembersInjector(
        clearErrorsForDisabledNodeRuleProvider,
        leafValueRequiredValidationRuleProvider,
        nodeReferenceChangeRuleProvider);
  }

  @Override
  public void injectMembers(RelatedPersonReferenceNodeRuleProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    zhy2002.neutron.UiNodeRuleProvider_MembersInjector.injectClearErrorsForDisabledNodeRuleProvider(
        instance, clearErrorsForDisabledNodeRuleProvider);
    zhy2002.neutron.LeafUiNodeRuleProvider_MembersInjector
        .injectLeafValueRequiredValidationRuleProvider(
            instance, leafValueRequiredValidationRuleProvider);
    zhy2002.neutron.node.ReferenceUiNodeRuleProvider_MembersInjector
        .injectNodeReferenceChangeRuleProvider(instance, nodeReferenceChangeRuleProvider);
  }
}
