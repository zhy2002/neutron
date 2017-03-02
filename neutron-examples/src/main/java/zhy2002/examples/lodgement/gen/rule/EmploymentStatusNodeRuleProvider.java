package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.EmploymentStatusNode;


@EmploymentStatusNodeScope
public class EmploymentStatusNodeRuleProvider
    extends StringUiNodeRuleProvider<EmploymentStatusNode> {

    @Inject
    public EmploymentStatusNodeRuleProvider() {}

    @Override
    public void initializeState(EmploymentStatusNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
