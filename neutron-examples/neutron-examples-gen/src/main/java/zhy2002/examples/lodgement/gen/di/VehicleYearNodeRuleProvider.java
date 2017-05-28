package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.VehicleYearNode;
import zhy2002.examples.lodgement.gen.di.*;

@VehicleYearNodeScope
public class VehicleYearNodeRuleProvider implements RuleProvider<VehicleYearNode> {

    @Inject
    BigDecimalUiNodeRuleProvider parentRuleProvider;

    @Inject
    public VehicleYearNodeRuleProvider() {
    }

    @Override
    public void initializeState(VehicleYearNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
