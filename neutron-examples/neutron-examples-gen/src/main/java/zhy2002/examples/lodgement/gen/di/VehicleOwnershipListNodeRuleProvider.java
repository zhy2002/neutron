package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.VehicleOwnershipListNode;
import zhy2002.examples.lodgement.gen.di.*;

@VehicleOwnershipListNodeScope
public class VehicleOwnershipListNodeRuleProvider implements RuleProvider<VehicleOwnershipListNode> {

    @Inject
    OwnershipListNodeRuleProvider parentRuleProvider;

    @Inject
    public VehicleOwnershipListNodeRuleProvider() {
    }

    @Override
    public void initializeState(VehicleOwnershipListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
