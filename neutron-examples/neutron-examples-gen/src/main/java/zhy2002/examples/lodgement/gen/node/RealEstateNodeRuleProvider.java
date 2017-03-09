package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@RealEstateNodeScope
public class RealEstateNodeRuleProvider implements RuleProvider<RealEstateNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public RealEstateNodeRuleProvider() {
    }

    @Override
    public void initializeState(RealEstateNode node) {
        parentRuleProvider.initializeState(node);

        node.setSelectedName("usageNode");
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
