package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CompanyPrimaryApplicantFlagNode;


@CompanyPrimaryApplicantFlagNodeScope
public class CompanyPrimaryApplicantFlagNodeRuleProvider
    extends BooleanUiNodeRuleProvider<CompanyPrimaryApplicantFlagNode> {

    @Inject
    public CompanyPrimaryApplicantFlagNodeRuleProvider() {}

    @Override
    public void initializeState(CompanyPrimaryApplicantFlagNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
