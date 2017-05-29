package zhy2002.examples.lodgement.banka.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.banka.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@PrimaryApplicantFlagNodeScope
public class BankAPrimaryApplicantFlagNodeRuleProvider extends PrimaryApplicantFlagNodeRuleProvider {

    @Inject
    public BankAPrimaryApplicantFlagNodeRuleProvider() {
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
