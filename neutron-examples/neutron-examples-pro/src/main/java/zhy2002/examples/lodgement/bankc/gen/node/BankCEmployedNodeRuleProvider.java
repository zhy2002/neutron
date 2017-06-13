package zhy2002.examples.lodgement.bankc.gen.node;
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



public class BankCEmployedNodeRuleProvider extends EmployedNodeRuleProvider {

    @Inject
    public BankCEmployedNodeRuleProvider() {
    }

    @Override
    public void initializeState(EmployedNode node) {
        super.initializeState(node);

    }

    @Inject
    Provider<DoNotLoadEndedDateForCurrentRecordRule> doNotLoadEndedDateForCurrentRecordRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        {
            DoNotLoadEndedDateForCurrentRecordRule doNotLoadEndedDateForCurrentRecordRule = doNotLoadEndedDateForCurrentRecordRuleProvider.get();
            createdRules.add(doNotLoadEndedDateForCurrentRecordRule);
        }
    }

}
