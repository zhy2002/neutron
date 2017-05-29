package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.PreviousEmploymentNode;
import zhy2002.examples.lodgement.gen.di.*;

@PreviousEmploymentNodeScope
public class PreviousEmploymentNodeRuleProvider implements RuleProvider<PreviousEmploymentNode> {

    @Inject
    EmploymentNodeRuleProvider parentRuleProvider;

    @Inject
    public PreviousEmploymentNodeRuleProvider() {
    }

    @Override
    public void initializeState(PreviousEmploymentNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}