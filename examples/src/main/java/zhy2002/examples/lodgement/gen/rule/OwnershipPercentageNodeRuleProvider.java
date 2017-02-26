package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.OwnershipPercentageNode;


@OwnershipPercentageNodeScope
public class OwnershipPercentageNodeRuleProvider
    extends BasePercentageNodeRuleProvider<OwnershipPercentageNode> {

    @Inject
    public OwnershipPercentageNodeRuleProvider() {}

    @Override
    public void initializeState(OwnershipPercentageNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
