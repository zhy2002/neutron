package zhy2002.examples.lodgement.bankb.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@LoanTypeNodeScope
public class BankBLoanTypeNodeRuleProvider extends LoanTypeNodeRuleProvider {

    @Inject
    public BankBLoanTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(LoanTypeNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.LIABILITY_LOAN_TYPE);
        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
