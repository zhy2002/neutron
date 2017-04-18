package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@EmploymentStatusNodeScope
public class EmploymentStatusNodeRuleProvider implements RuleProvider<EmploymentStatusNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public EmploymentStatusNodeRuleProvider() {
    }

    @Override
    public void initializeState(EmploymentStatusNode node) {
        parentRuleProvider.initializeState(node);

        node.setOptions(ApplicationNodeConstants.EMPLOYMENT_STATUS);
        node.setRequired(true);
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
