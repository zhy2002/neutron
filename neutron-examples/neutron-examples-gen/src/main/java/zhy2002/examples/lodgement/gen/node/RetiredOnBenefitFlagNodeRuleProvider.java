package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

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

        node.setRequired(true);
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
    }

}
