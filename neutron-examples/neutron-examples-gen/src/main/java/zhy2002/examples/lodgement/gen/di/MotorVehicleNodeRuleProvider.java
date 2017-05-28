package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.MotorVehicleNode;
import zhy2002.examples.lodgement.gen.di.*;

@MotorVehicleNodeScope
public class MotorVehicleNodeRuleProvider implements RuleProvider<MotorVehicleNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public MotorVehicleNodeRuleProvider() {
    }

    @Override
    public void initializeState(MotorVehicleNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
