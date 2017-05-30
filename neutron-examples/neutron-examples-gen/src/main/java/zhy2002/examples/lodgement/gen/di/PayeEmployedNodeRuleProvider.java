package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.PayeEmployedNode;
import zhy2002.examples.lodgement.gen.di.*;

@PayeEmployedNodeScope
public class PayeEmployedNodeRuleProvider implements RuleProvider<PayeEmployedNode> {

    @Inject
    EmployedNodeRuleProvider parentRuleProvider;

    @Inject
    public PayeEmployedNodeRuleProvider() {
    }

    @Override
    public void initializeState(PayeEmployedNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
