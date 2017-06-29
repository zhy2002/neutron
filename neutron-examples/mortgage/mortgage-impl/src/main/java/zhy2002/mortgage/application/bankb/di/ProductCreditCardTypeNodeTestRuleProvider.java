package zhy2002.mortgage.application.bankb.di;

import zhy2002.mortgage.application.gen.node.ProductCreditCardTypeNode;
import zhy2002.neutron.RuleProvider;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.data.StringOption;

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
    public ProductCreditCardTypeNodeTestRuleProvider() {
    }

    @Override
    public void initializeState(ProductCreditCardTypeNode node) {
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
