package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;

@EmploymentTypeNodeScope
public class EmploymentTypeNodeRuleProvider extends StringUiNodeRuleProvider {

    @Inject
    public EmploymentTypeNodeRuleProvider() {}

    @Inject
    Provider<EmploymentTypeChangedRule> employmentTypeChangedRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(employmentTypeChangedRuleProvider.get());
    }

}
