package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

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
