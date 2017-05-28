package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ContributionTypeNode;
import zhy2002.examples.lodgement.gen.di.*;

@ContributionTypeNodeScope
public class ContributionTypeNodeRuleProvider implements RuleProvider<ContributionTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ContributionTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(ContributionTypeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
