package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.LoanMonthlyRepaymentNode;
import zhy2002.examples.lodgement.gen.di.*;

@LoanMonthlyRepaymentNodeScope
public class LoanMonthlyRepaymentNodeRuleProvider implements RuleProvider<LoanMonthlyRepaymentNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public LoanMonthlyRepaymentNodeRuleProvider() {
    }

    @Override
    public void initializeState(LoanMonthlyRepaymentNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
