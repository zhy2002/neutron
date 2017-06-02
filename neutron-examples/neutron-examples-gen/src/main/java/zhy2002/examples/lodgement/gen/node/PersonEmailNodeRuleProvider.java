package zhy2002.examples.lodgement.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.PersonEmailNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class PersonEmailNodeRuleProvider implements RuleProvider<PersonEmailNode> {

    @Inject
    EmailNodeRuleProvider parentRuleProvider;

    @Inject
    public PersonEmailNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonEmailNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
