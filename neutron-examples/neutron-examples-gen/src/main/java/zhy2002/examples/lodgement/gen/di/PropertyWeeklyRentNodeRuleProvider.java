package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.PropertyWeeklyRentNode;
import zhy2002.examples.lodgement.gen.di.*;

@PropertyWeeklyRentNodeScope
public class PropertyWeeklyRentNodeRuleProvider implements RuleProvider<PropertyWeeklyRentNode> {

    @Inject
    BigDecimalUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PropertyWeeklyRentNodeRuleProvider() {
    }

    @Override
    public void initializeState(PropertyWeeklyRentNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
