package zhy2002.examples.lodgement.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.PersonNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class PersonNodeRuleProvider implements RuleProvider<PersonNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PersonNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}