package zhy2002.mortgage.application.bankb.di;

import zhy2002.mortgage.application.gen.node.BrokerCompanyNode;
import zhy2002.neutron.core.RuleProvider;
import zhy2002.neutron.core.UiNodeRule;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.rule.AcceptValueLengthValidationRule;
import zhy2002.neutron.core.rule.LengthValidationRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;

public class BrokerCompanyNodeTestRuleProvider implements RuleProvider<BrokerCompanyNode> {

    @Inject
    Provider<AcceptValueLengthValidationRule> acceptValueLengthValidationRuleProvider;

    @Inject
    public BrokerCompanyNodeTestRuleProvider(@Owner BrokerCompanyNode node) {
        node.setMinLength(3);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        createdRules.removeIf(rule -> rule instanceof LengthValidationRule);
        createdRules.add(acceptValueLengthValidationRuleProvider.get());
    }
}
