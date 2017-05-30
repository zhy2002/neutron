package zhy2002.examples.lodgement.bankc.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@MortgageClearingFlagNodeScope
public class BankCMortgageClearingFlagNodeRuleProvider extends MortgageClearingFlagNodeRuleProvider {

    @Inject
    public BankCMortgageClearingFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(MortgageClearingFlagNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
