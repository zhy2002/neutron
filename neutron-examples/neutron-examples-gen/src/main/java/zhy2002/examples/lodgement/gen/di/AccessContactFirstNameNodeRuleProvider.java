package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.AccessContactFirstNameNode;
import zhy2002.examples.lodgement.gen.di.*;

@AccessContactFirstNameNodeScope
public class AccessContactFirstNameNodeRuleProvider implements RuleProvider<AccessContactFirstNameNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public AccessContactFirstNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(AccessContactFirstNameNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
