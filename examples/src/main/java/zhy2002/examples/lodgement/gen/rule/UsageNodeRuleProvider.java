package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.UsageNode;


@UsageNodeScope
public class UsageNodeRuleProvider
    extends ObjectUiNodeRuleProvider<UsageNode> {

    @Inject
    public UsageNodeRuleProvider() {}

    @Override
    public void initializeState(UsageNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
