package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.MotorVehicleListNode;


@MotorVehicleListNodeScope
public class MotorVehicleListNodeRuleProvider
    extends ListUiNodeRuleProvider<MotorVehicleListNode> {

    @Inject
    public MotorVehicleListNodeRuleProvider() {}

    @Override
    public void initializeState(MotorVehicleListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
