package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.MortgqageUnpaidBalanceNode;
import zhy2002.examples.lodgement.gen.di.*;

@MortgqageUnpaidBalanceNodeScope
public class MortgqageUnpaidBalanceNodeRuleProvider implements RuleProvider<MortgqageUnpaidBalanceNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public MortgqageUnpaidBalanceNodeRuleProvider() {
    }

    @Override
    public void initializeState(MortgqageUnpaidBalanceNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
