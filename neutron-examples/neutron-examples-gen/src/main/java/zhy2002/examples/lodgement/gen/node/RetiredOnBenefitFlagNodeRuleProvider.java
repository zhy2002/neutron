package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@RetiredOnBenefitFlagNodeScope
public class RetiredOnBenefitFlagNodeRuleProvider implements RuleProvider<RetiredOnBenefitFlagNode> {

    @Inject
    YesNoOptionNodeRuleProvider parentRuleProvider;

    @Inject
    public RetiredOnBenefitFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(RetiredOnBenefitFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
