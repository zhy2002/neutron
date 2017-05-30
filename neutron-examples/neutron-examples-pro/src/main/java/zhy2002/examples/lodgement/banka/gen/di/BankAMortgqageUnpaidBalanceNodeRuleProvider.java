package zhy2002.examples.lodgement.banka.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@MortgqageUnpaidBalanceNodeScope
public class BankAMortgqageUnpaidBalanceNodeRuleProvider extends MortgqageUnpaidBalanceNodeRuleProvider {

    @Inject
    public BankAMortgqageUnpaidBalanceNodeRuleProvider() {
    }

    @Override
    public void initializeState(MortgqageUnpaidBalanceNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
