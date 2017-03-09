package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@PreviousEmploymentListNodeScope
public class PreviousEmploymentListNodeRuleProvider implements RuleProvider<PreviousEmploymentListNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PreviousEmploymentListNodeRuleProvider() {
    }

    @Override
    public void initializeState(PreviousEmploymentListNode node) {
        parentRuleProvider.initializeState(node);

        node.setNodeLabel("Previous Employment");
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
