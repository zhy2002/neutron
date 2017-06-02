package zhy2002.examples.lodgement.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.VehicleMarketValueNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class VehicleMarketValueNodeRuleProvider implements RuleProvider<VehicleMarketValueNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public VehicleMarketValueNodeRuleProvider() {
    }

    @Override
    public void initializeState(VehicleMarketValueNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
