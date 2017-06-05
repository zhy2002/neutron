package zhy2002.examples.lodgement.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.AddressLineNode;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@ComponentScope
public class AddressLineNodeRuleProvider implements RuleProvider<AddressLineNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public AddressLineNodeRuleProvider() {
    }

    @Override
    public void initializeState(AddressLineNode node) {
        parentRuleProvider.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}