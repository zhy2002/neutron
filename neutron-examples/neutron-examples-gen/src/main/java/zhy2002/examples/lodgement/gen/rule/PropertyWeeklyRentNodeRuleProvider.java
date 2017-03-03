package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PropertyWeeklyRentNode;


@PropertyWeeklyRentNodeScope
public class PropertyWeeklyRentNodeRuleProvider
    extends BigDecimalUiNodeRuleProvider<PropertyWeeklyRentNode> {

    @Inject
    public PropertyWeeklyRentNodeRuleProvider() {}

    @Override
    public void initializeState(PropertyWeeklyRentNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
