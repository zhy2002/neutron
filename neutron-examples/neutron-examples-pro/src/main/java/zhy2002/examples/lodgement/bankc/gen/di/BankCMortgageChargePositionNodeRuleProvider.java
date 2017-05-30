package zhy2002.examples.lodgement.bankc.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@MortgageChargePositionNodeScope
public class BankCMortgageChargePositionNodeRuleProvider extends MortgageChargePositionNodeRuleProvider {

    @Inject
    public BankCMortgageChargePositionNodeRuleProvider() {
    }

    @Override
    public void initializeState(MortgageChargePositionNode node) {
        super.initializeState(node);

        node.setRequired(true);
        node.setOptions(ApplicationNodeConstants.LENDER_CHARGE_POSITION);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
