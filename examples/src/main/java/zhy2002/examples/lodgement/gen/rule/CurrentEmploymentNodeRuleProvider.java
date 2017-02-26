package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CurrentEmploymentNode;


@CurrentEmploymentNodeScope
public class CurrentEmploymentNodeRuleProvider
    extends EmploymentNodeRuleProvider<CurrentEmploymentNode> {

    @Inject
    public CurrentEmploymentNodeRuleProvider() {}

    @Override
    public void initializeState(CurrentEmploymentNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
