package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.EmploymentStartedNode;


@EmploymentStartedNodeScope
public class EmploymentStartedNodeRuleProvider
    extends MonthYearNodeRuleProvider<EmploymentStartedNode> {

    @Inject
    public EmploymentStartedNodeRuleProvider() {}

    @Override
    public void initializeState(EmploymentStartedNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
