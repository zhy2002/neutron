package zhy2002.examples.app.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.app.gen.di.*;
import javax.inject.*;
import zhy2002.examples.app.gen.rule.*;

@LodgementNodeScope
public class LodgementNodeRuleProvider implements RuleProvider<LodgementNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public LodgementNodeRuleProvider() {
    }

    @Override
    public void initializeState(LodgementNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<DummyRule> dummyRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
            createdRules.add(dummyRuleProvider.get());
    }

}
