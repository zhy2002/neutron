package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.PropertyAddressNode;
import zhy2002.examples.lodgement.gen.di.*;

@PropertyAddressNodeScope
public class PropertyAddressNodeRuleProvider implements RuleProvider<PropertyAddressNode> {

    @Inject
    AddressNodeRuleProvider parentRuleProvider;

    @Inject
    public PropertyAddressNodeRuleProvider() {
    }

    @Override
    public void initializeState(PropertyAddressNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
