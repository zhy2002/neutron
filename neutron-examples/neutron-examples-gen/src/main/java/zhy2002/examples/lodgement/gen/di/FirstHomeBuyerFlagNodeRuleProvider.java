package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.FirstHomeBuyerFlagNode;
import zhy2002.examples.lodgement.gen.di.*;

@FirstHomeBuyerFlagNodeScope
public class FirstHomeBuyerFlagNodeRuleProvider implements RuleProvider<FirstHomeBuyerFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public FirstHomeBuyerFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(FirstHomeBuyerFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
