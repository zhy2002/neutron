package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.StatusNode;
import zhy2002.examples.lodgement.gen.di.*;

@StatusNodeScope
public class StatusNodeRuleProvider implements RuleProvider<StatusNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public StatusNodeRuleProvider() {
    }

    @Override
    public void initializeState(StatusNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}