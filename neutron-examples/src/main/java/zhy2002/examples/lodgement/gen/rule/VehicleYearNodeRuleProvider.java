package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.VehicleYearNode;


@VehicleYearNodeScope
public class VehicleYearNodeRuleProvider
    extends BigDecimalUiNodeRuleProvider<VehicleYearNode> {

    @Inject
    public VehicleYearNodeRuleProvider() {}

    @Override
    public void initializeState(VehicleYearNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}