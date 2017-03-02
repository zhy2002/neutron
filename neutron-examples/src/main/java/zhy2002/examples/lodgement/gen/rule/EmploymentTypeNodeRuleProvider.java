package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.EmploymentTypeNode;


@EmploymentTypeNodeScope
public class EmploymentTypeNodeRuleProvider
    extends StringUiNodeRuleProvider<EmploymentTypeNode> {

    @Inject
    public EmploymentTypeNodeRuleProvider() {}

    @Override
    public void initializeState(EmploymentTypeNode node) {
    }


    @Inject
    Provider<EmploymentTypeChangedRule> employmentTypeChangedRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(employmentTypeChangedRuleProvider.get());
    }

}
