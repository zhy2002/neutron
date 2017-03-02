package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.MotorVehicleNode;


@MotorVehicleNodeScope
public class MotorVehicleNodeRuleProvider
    extends ObjectUiNodeRuleProvider<MotorVehicleNode> {

    @Inject
    public MotorVehicleNodeRuleProvider() {}

    @Override
    public void initializeState(MotorVehicleNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
