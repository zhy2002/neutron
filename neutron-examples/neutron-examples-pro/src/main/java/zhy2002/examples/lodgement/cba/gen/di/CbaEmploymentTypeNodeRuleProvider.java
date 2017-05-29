package zhy2002.examples.lodgement.cba.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.cba.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@EmploymentTypeNodeScope
public class CbaEmploymentTypeNodeRuleProvider extends EmploymentTypeNodeRuleProvider {

    @Inject
    public CbaEmploymentTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(EmploymentTypeNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.EMPLOYMENT_TYPE);
        node.setValue("payeEmployedNode");
    }

    @Inject
    Provider<EmploymentTypeChangedRule> employmentTypeChangedRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        EmploymentTypeChangedRule employmentTypeChangedRule = employmentTypeChangedRuleProvider.get();
        createdRules.add(employmentTypeChangedRule);
    }

}
