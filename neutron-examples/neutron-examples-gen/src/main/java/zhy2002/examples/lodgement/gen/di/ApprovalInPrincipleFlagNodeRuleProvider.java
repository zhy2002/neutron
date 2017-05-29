package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ApprovalInPrincipleFlagNode;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@ApprovalInPrincipleFlagNodeScope
public class ApprovalInPrincipleFlagNodeRuleProvider implements RuleProvider<ApprovalInPrincipleFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ApprovalInPrincipleFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(ApprovalInPrincipleFlagNode node) {
        parentRuleProvider.initializeState(node);

        node.setValue(null);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}