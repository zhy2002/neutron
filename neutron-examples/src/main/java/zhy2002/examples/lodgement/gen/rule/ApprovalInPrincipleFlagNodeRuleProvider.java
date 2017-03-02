package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ApprovalInPrincipleFlagNode;


@ApprovalInPrincipleFlagNodeScope
public class ApprovalInPrincipleFlagNodeRuleProvider
    extends BooleanUiNodeRuleProvider<ApprovalInPrincipleFlagNode> {

    @Inject
    public ApprovalInPrincipleFlagNodeRuleProvider() {}

    @Override
    public void initializeState(ApprovalInPrincipleFlagNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
