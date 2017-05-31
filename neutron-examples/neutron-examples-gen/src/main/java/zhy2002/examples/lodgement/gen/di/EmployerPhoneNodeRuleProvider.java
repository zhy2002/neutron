package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.EmployerPhoneNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class EmployerPhoneNodeRuleProvider implements RuleProvider<EmployerPhoneNode> {

    @Inject
    TelephoneNodeRuleProvider parentRuleProvider;

    @Inject
    public EmployerPhoneNodeRuleProvider() {
    }

    @Override
    public void initializeState(EmployerPhoneNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
