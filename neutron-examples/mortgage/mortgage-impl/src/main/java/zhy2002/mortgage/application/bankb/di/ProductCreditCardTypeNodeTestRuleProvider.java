package zhy2002.mortgage.application.bankb.di;

import zhy2002.mortgage.application.gen.node.ProductCreditCardTypeNode;
import zhy2002.neutron.core.RuleProvider;
import zhy2002.neutron.core.UiNodeRule;
import zhy2002.neutron.core.data.StringOption;
import zhy2002.neutron.core.di.Owner;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;


public class ProductCreditCardTypeNodeTestRuleProvider implements RuleProvider<ProductCreditCardTypeNode> {

    private static StringOption[] CARD_OPTIONS = {
            new StringOption(""),
            new StringOption("Low Rate Card"),
            new StringOption("Low Fee Card"),
            new StringOption("Rewards Card"),
            new StringOption("Premium Card")
    };

    @Inject
    public ProductCreditCardTypeNodeTestRuleProvider(@Owner ProductCreditCardTypeNode node) {
        node.setOptions(CARD_OPTIONS);
        node.setRequired(true);
    }

    @Inject
    Provider<DisableRewardsProgramRule> disableRewardsProgramRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        createdRules.add(disableRewardsProgramRuleProvider.get());
    }
}
