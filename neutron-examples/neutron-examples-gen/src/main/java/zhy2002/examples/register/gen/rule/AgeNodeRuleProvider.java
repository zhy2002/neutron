package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.AgeNode;


@AgeNodeScope
public class AgeNodeRuleProvider
    extends BigDecimalUiNodeRuleProvider<AgeNode> {

    @Inject
    public AgeNodeRuleProvider() {}

    @Override
    public void initializeState(AgeNode node) {
    }


    @Inject
    Provider<UpdatePlanRule> updatePlanRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(updatePlanRuleProvider.get());
    }

}
