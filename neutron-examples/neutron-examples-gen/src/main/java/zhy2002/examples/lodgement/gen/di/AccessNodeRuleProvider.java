package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.AccessNode;
import zhy2002.examples.lodgement.gen.di.*;

@AccessNodeScope
public class AccessNodeRuleProvider implements RuleProvider<AccessNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public AccessNodeRuleProvider() {
    }

    @Override
    public void initializeState(AccessNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
