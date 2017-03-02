package zhy2002.neutron.node;

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
public final class ReferenceUiNodeRuleProvider_MembersInjector<N extends ReferenceUiNode<?>>
    implements MembersInjector<ReferenceUiNodeRuleProvider<N>> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

  private final Provider<NodeReferenceChangeRule> nodeReferenceChangeRuleProvider;

  public ReferenceUiNodeRuleProvider_MembersInjector(
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

  public static <N extends ReferenceUiNode<?>>
      MembersInjector<ReferenceUiNodeRuleProvider<N>> create(
          Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
          Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
          Provider<NodeReferenceChangeRule> nodeReferenceChangeRuleProvider) {
    return new ReferenceUiNodeRuleProvider_MembersInjector<N>(
        clearErrorsForDisabledNodeRuleProvider,
        leafValueRequiredValidationRuleProvider,
        nodeReferenceChangeRuleProvider);
  }

  @Override
  public void injectMembers(ReferenceUiNodeRuleProvider<N> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    zhy2002.neutron.UiNodeRuleProvider_MembersInjector.injectClearErrorsForDisabledNodeRuleProvider(
        instance, clearErrorsForDisabledNodeRuleProvider);
    zhy2002.neutron.LeafUiNodeRuleProvider_MembersInjector
        .injectLeafValueRequiredValidationRuleProvider(
            instance, leafValueRequiredValidationRuleProvider);
    instance.nodeReferenceChangeRuleProvider = nodeReferenceChangeRuleProvider;
  }

  public static <N extends ReferenceUiNode<?>> void injectNodeReferenceChangeRuleProvider(
      ReferenceUiNodeRuleProvider<N> instance,
      Provider<NodeReferenceChangeRule> nodeReferenceChangeRuleProvider) {
    instance.nodeReferenceChangeRuleProvider = nodeReferenceChangeRuleProvider;
  }
}
