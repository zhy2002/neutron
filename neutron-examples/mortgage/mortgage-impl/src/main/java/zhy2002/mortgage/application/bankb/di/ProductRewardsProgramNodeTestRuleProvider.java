package zhy2002.mortgage.application.bankb.di;

import zhy2002.mortgage.application.gen.node.ProductRewardsProgramNode;
import zhy2002.neutron.core.RuleProvider;
import zhy2002.neutron.core.UiNodeRule;
import zhy2002.neutron.core.data.StringOption;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.rule.StringEnableSiblingRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;


public class ProductRewardsProgramNodeTestRuleProvider implements RuleProvider<ProductRewardsProgramNode> {

    private static StringOption[] REWARDS_OPTIONS = {
            new StringOption(""),
            new StringOption("Coles"),
            new StringOption("Woolworths")
    };

    @Inject
    public ProductRewardsProgramNodeTestRuleProvider(@Owner ProductRewardsProgramNode node) {
        node.setOptions(REWARDS_OPTIONS);
    }

    @Inject
    Provider<StringEnableSiblingRule> stringEnableSiblingRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        {
            StringEnableSiblingRule rule = stringEnableSiblingRuleProvider.get();
            rule.setSiblingName("productRewardsMembershipNode");
            rule.setDisablingValue("");
            createdRules.add(rule);
        }
    }
}
