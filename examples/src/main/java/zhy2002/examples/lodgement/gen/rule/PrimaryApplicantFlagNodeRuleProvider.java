package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PrimaryApplicantFlagNode;


@PrimaryApplicantFlagNodeScope
public class PrimaryApplicantFlagNodeRuleProvider
    extends BooleanUiNodeRuleProvider<PrimaryApplicantFlagNode> {

    @Inject
    public PrimaryApplicantFlagNodeRuleProvider() {}

    @Override
    public void initializeState(PrimaryApplicantFlagNode node) {
    }


    @Inject
    Provider<AtLeastOnePrimaryApplicantRule> atLeastOnePrimaryApplicantRuleProvider;
    @Inject
    Provider<AtMostOnePrimaryApplicantRule> atMostOnePrimaryApplicantRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(atLeastOnePrimaryApplicantRuleProvider.get());
            createdRules.add(atMostOnePrimaryApplicantRuleProvider.get());
    }

}
