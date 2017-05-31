package zhy2002.examples.lodgement.bankc.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankc.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@ComponentScope
public class BankCFinancialPositionNodeRuleProvider extends FinancialPositionNodeRuleProvider {

    @Inject
    public BankCFinancialPositionNodeRuleProvider() {
    }

    @Override
    public void initializeState(FinancialPositionNode node) {
        super.initializeState(node);

    }

    @Inject
    Provider<FinancialPositionChangedRule> financialPositionChangedRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        FinancialPositionChangedRule financialPositionChangedRule = financialPositionChangedRuleProvider.get();
        createdRules.add(financialPositionChangedRule);
    }

}
