package zhy2002.examples.app.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.app.gen.node.LodgementNode;
import zhy2002.examples.app.gen.di.*;

@LodgementNodeScope
public class LodgementNodeRuleProvider implements RuleProvider<LodgementNode> {

    @Inject
    RootUiNodeRuleProvider parentRuleProvider;

    @Inject
    public LodgementNodeRuleProvider() {
    }

    @Override
    public void initializeState(LodgementNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}