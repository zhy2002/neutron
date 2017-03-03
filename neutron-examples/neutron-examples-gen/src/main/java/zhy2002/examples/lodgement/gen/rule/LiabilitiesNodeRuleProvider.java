package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.LiabilitiesNode;


@LiabilitiesNodeScope
public class LiabilitiesNodeRuleProvider
    extends ObjectUiNodeRuleProvider<LiabilitiesNode> {

    @Inject
    public LiabilitiesNodeRuleProvider() {}

    @Override
    public void initializeState(LiabilitiesNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
