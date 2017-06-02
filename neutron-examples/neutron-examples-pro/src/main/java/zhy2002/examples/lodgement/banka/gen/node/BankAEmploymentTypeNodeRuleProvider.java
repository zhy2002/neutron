package zhy2002.examples.lodgement.banka.gen.node;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.banka.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@ComponentScope
public class BankAEmploymentTypeNodeRuleProvider extends EmploymentTypeNodeRuleProvider {

    @Inject
    public BankAEmploymentTypeNodeRuleProvider() {
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
