package zhy2002.mortgage.application.bankb.di;

import zhy2002.mortgage.application.gen.node.ProductPackageNameNode;
import zhy2002.neutron.RuleProvider;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.rule.StringEnableSiblingRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;

class ProductPackageNameNodeTestRuleProvider implements RuleProvider<ProductPackageNameNode> {

    @Inject
    public ProductPackageNameNodeTestRuleProvider() {
    }

    @Override
    public void initializeState(ProductPackageNameNode node) {
    }

    @Inject
    Provider<StringEnableSiblingRule> stringEnableSiblingRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        {
            StringEnableSiblingRule stringEnableSiblingRule = stringEnableSiblingRuleProvider.get();
            stringEnableSiblingRule.setEnablingValue("Choice Package");
            stringEnableSiblingRule.setSiblingName("productCreditCardFlagNode");
            createdRules.add(stringEnableSiblingRule);
        }
    }
}