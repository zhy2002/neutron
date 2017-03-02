package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.OccupationNode;


@OccupationNodeScope
public class OccupationNodeRuleProvider
    extends BaseOccupationNodeRuleProvider<OccupationNode> {

    @Inject
    public OccupationNodeRuleProvider() {}

    @Override
    public void initializeState(OccupationNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
