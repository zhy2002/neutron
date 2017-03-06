package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CompanyPrimaryApplicantFlagNodeScope
public class CompanyPrimaryApplicantFlagNodeRuleProvider implements RuleProvider<CompanyPrimaryApplicantFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyPrimaryApplicantFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyPrimaryApplicantFlagNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
    }

}
