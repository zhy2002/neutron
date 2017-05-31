package zhy2002.examples.register.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.PhoneNumberNode;
import zhy2002.examples.register.gen.di.*;
import zhy2002.examples.register.data.*;
import java.math.*;

@ComponentScope
public class PhoneNumberNodeRuleProvider implements RuleProvider<PhoneNumberNode> {

    @Inject
    PhoneInfoFieldNodeRuleProvider parentRuleProvider;

    @Inject
    public PhoneNumberNodeRuleProvider() {
    }

    @Override
    public void initializeState(PhoneNumberNode node) {
        parentRuleProvider.initializeState(node);

        node.setRequiredMessage("Phone number is required.");
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
