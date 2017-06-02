package zhy2002.examples.lodgement.bankc.gen.node;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ComponentScope
public class BankCMortgageLoanTypeNodeRuleProvider extends MortgageLoanTypeNodeRuleProvider {

    @Inject
    public BankCMortgageLoanTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(MortgageLoanTypeNode node) {
        super.initializeState(node);

        node.setRequired(true);
        node.setOptions(ApplicationNodeConstants.LIABILITY_LOAN_TYPE);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
