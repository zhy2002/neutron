package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@UnemployedOnBenefitFlagNodeScope
public class UnemployedOnBenefitFlagNodeRuleProvider implements RuleProvider<UnemployedOnBenefitFlagNode> {

    @Inject
    YesNoOptionNodeRuleProvider parentRuleProvider;

    @Inject
    public UnemployedOnBenefitFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(UnemployedOnBenefitFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
