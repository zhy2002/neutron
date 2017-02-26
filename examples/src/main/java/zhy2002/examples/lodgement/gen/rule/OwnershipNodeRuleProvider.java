package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.OwnershipNode;


@OwnershipNodeScope
public class OwnershipNodeRuleProvider
    extends ObjectUiNodeRuleProvider<OwnershipNode> {

    @Inject
    public OwnershipNodeRuleProvider() {}

    @Override
    public void initializeState(OwnershipNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
