package zhy2002.examples.register.gen.node;
/* template name: child_rule_provider.ftl */
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import javax.inject.*;
import zhy2002.examples.register.gen.di.*;
import java.util.*;


@ComponentScope
public class RegisterNodeChildInvestmentPropertyNodeRuleProvider implements RuleProvider<PropertyDetailsNode> {

    @Inject
    public RegisterNodeChildInvestmentPropertyNodeRuleProvider() {
    }

    @Override
    public void initializeState(PropertyDetailsNode node) {
        node.setLoadWithParent(false);
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
    }
}
