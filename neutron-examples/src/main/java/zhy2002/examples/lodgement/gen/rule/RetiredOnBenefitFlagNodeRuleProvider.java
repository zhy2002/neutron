package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.RetiredOnBenefitFlagNode;


@RetiredOnBenefitFlagNodeScope
public class RetiredOnBenefitFlagNodeRuleProvider
    extends YesNoOptionNodeRuleProvider<RetiredOnBenefitFlagNode> {

    @Inject
    public RetiredOnBenefitFlagNodeRuleProvider() {}

    @Override
    public void initializeState(RetiredOnBenefitFlagNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
