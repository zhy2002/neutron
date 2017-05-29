package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.westpac.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@PrimaryApplicantFlagNodeScope
public class WestpacPrimaryApplicantFlagNodeRuleProvider extends PrimaryApplicantFlagNodeRuleProvider {

    @Inject
    public WestpacPrimaryApplicantFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(PrimaryApplicantFlagNode node) {
        super.initializeState(node);

    }

    @Inject
    Provider<AtLeastOnePrimaryApplicantRule> atLeastOnePrimaryApplicantRuleProvider;
    @Inject
    Provider<AtMostOnePrimaryApplicantRule> atMostOnePrimaryApplicantRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        AtLeastOnePrimaryApplicantRule atLeastOnePrimaryApplicantRule = atLeastOnePrimaryApplicantRuleProvider.get();
        createdRules.add(atLeastOnePrimaryApplicantRule);
        AtMostOnePrimaryApplicantRule atMostOnePrimaryApplicantRule = atMostOnePrimaryApplicantRuleProvider.get();
        createdRules.add(atMostOnePrimaryApplicantRule);
    }

}
