package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.VehicleMarketValueNode;


@VehicleMarketValueNodeScope
public class VehicleMarketValueNodeRuleProvider
    extends BaseCurrencyNodeRuleProvider<VehicleMarketValueNode> {

    @Inject
    public VehicleMarketValueNodeRuleProvider() {}

    @Override
    public void initializeState(VehicleMarketValueNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
