package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;

@PrimaryApplicantFlagNodeScope
public class PrimaryApplicantFlagNodeRuleProvider implements RuleProvider<PrimaryApplicantFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PrimaryApplicantFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(PrimaryApplicantFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<AtLeastOnePrimaryApplicantRule> atLeastOnePrimaryApplicantRuleProvider;
    @Inject
    Provider<AtMostOnePrimaryApplicantRule> atMostOnePrimaryApplicantRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

            AtLeastOnePrimaryApplicantRule atLeastOnePrimaryApplicantRule = atLeastOnePrimaryApplicantRuleProvider.get();
            createdRules.add(atLeastOnePrimaryApplicantRule);
            AtMostOnePrimaryApplicantRule atMostOnePrimaryApplicantRule = atMostOnePrimaryApplicantRuleProvider.get();
            createdRules.add(atMostOnePrimaryApplicantRule);
    }

}
