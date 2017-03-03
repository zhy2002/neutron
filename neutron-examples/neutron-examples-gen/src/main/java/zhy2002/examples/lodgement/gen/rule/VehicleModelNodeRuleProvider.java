package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.VehicleModelNode;


@VehicleModelNodeScope
public class VehicleModelNodeRuleProvider
    extends StringUiNodeRuleProvider<VehicleModelNode> {

    @Inject
    public VehicleModelNodeRuleProvider() {}

    @Override
    public void initializeState(VehicleModelNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
