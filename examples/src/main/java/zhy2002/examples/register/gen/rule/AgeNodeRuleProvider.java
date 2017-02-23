package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;

@AgeNodeScope
public class AgeNodeRuleProvider extends BigDecimalUiNodeRuleProvider {

    @Inject
    public AgeNodeRuleProvider() {}

    @Inject
    Provider<UpdatePlanRule> updatePlanRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(updatePlanRuleProvider.get());
    }

}
