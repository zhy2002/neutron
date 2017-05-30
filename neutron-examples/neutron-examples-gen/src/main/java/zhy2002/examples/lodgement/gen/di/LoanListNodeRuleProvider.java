package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.LoanListNode;
import zhy2002.examples.lodgement.gen.di.*;

@LoanListNodeScope
public class LoanListNodeRuleProvider implements RuleProvider<LoanListNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public LoanListNodeRuleProvider() {
    }

    @Override
    public void initializeState(LoanListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
