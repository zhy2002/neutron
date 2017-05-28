package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.SuburbNode;
import zhy2002.examples.lodgement.gen.di.*;

@SuburbNodeScope
public class SuburbNodeRuleProvider implements RuleProvider<SuburbNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public SuburbNodeRuleProvider() {
    }

    @Override
    public void initializeState(SuburbNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
