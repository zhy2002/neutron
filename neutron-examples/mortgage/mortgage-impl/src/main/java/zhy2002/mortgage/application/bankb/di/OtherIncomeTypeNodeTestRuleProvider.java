package zhy2002.mortgage.application.bankb.di;

import zhy2002.mortgage.application.data.ApplicationNodeConstants;
import zhy2002.mortgage.application.gen.node.CompanyNode;
import zhy2002.mortgage.application.gen.node.OtherIncomeTypeNode;
import zhy2002.neutron.core.RuleProvider;
import zhy2002.neutron.core.UiNodeRule;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.rule.StringEnableSiblingRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;


public class OtherIncomeTypeNodeTestRuleProvider implements RuleProvider<OtherIncomeTypeNode> {

    @Inject
    public OtherIncomeTypeNodeTestRuleProvider(@Owner OtherIncomeTypeNode node) {
        if (node.getContext().getNodeFinder().findAncestor(node, CompanyNode.class) != null) {
            node.setOptions(ApplicationNodeConstants.COMPANY_OTHER_INCOME_TYPE);
        } else {
            node.setOptions(ApplicationNodeConstants.PERSON_OTHER_INCOME_TYPE);
        }
    }

    @Inject
    Provider<StringEnableSiblingRule> stringEnableSiblingRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        {
            StringEnableSiblingRule stringEnableSiblingRule = stringEnableSiblingRuleProvider.get();
            stringEnableSiblingRule.setEnablingValue("Other Income");
            stringEnableSiblingRule.setSiblingName("otherIncomeDescriptionNode");
            createdRules.add(stringEnableSiblingRule);
        }
    }
}
