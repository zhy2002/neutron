package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.PersonTrustNode;
import zhy2002.examples.lodgement.gen.di.*;

@PersonTrustNodeScope
public class PersonTrustNodeRuleProvider implements RuleProvider<PersonTrustNode> {

    @Inject
    BaseTrustNodeRuleProvider parentRuleProvider;

    @Inject
    public PersonTrustNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonTrustNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
