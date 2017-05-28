package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.AccessContactTitleNode;
import zhy2002.examples.lodgement.gen.di.*;

@AccessContactTitleNodeScope
public class AccessContactTitleNodeRuleProvider implements RuleProvider<AccessContactTitleNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public AccessContactTitleNodeRuleProvider() {
    }

    @Override
    public void initializeState(AccessContactTitleNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
