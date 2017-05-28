package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.MotorVehicleListNode;
import zhy2002.examples.lodgement.gen.di.*;

@MotorVehicleListNodeScope
public class MotorVehicleListNodeRuleProvider implements RuleProvider<MotorVehicleListNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public MotorVehicleListNodeRuleProvider() {
    }

    @Override
    public void initializeState(MotorVehicleListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
