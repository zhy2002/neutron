package zhy2002.examples.lodgement.nab.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.nab.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@RealEstateNodeScope
public class NabRealEstateNodeRuleProvider extends RealEstateNodeRuleProvider {

    @Inject
    public NabRealEstateNodeRuleProvider() {
    }

    @Override
    public void initializeState(RealEstateNode node) {
        super.initializeState(node);

        node.setSelectedName("usageNode");
    }

    @Inject
    Provider<UpdateRealEstateNodeLabelRule> updateRealEstateNodeLabelRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UpdateRealEstateNodeLabelRule updateRealEstateNodeLabelRule = updateRealEstateNodeLabelRuleProvider.get();
        createdRules.add(updateRealEstateNodeLabelRule);
    }

}
