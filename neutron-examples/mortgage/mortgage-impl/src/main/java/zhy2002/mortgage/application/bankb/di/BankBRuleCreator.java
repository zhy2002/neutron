package zhy2002.mortgage.application.bankb.di;

import zhy2002.mortgage.application.gen.node.PersonEmailNode;
import zhy2002.mortgage.application.rule.NoDotInfoEmailRule;
import zhy2002.neutron.core.RuleCreator;

import javax.inject.Inject;
import java.util.List;


public class BankBRuleCreator extends RuleCreator {

    @Inject
    public BankBRuleCreator() {
    }

    @Override
    protected List<NodeRuleCreator<?>> getAllCreators() {
        List<NodeRuleCreator<?>> list = super.getAllCreators();
        list.add(
                new NodeRuleCreator<>(
                        PersonEmailNode.class,
                        (owner, createdRules) -> createdRules.add(new NoDotInfoEmailRule(owner))
                )
        );
        return list;
    }
}
