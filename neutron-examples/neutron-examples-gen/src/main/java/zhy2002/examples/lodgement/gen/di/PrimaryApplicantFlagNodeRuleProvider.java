package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.PrimaryApplicantFlagNode;
import zhy2002.examples.lodgement.gen.di.*;

@PrimaryApplicantFlagNodeScope
public class PrimaryApplicantFlagNodeRuleProvider implements RuleProvider<PrimaryApplicantFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PrimaryApplicantFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(PrimaryApplicantFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
