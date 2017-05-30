package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ApplicationTypeNode;
import zhy2002.examples.lodgement.gen.di.*;

@ApplicationTypeNodeScope
public class ApplicationTypeNodeRuleProvider implements RuleProvider<ApplicationTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ApplicationTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(ApplicationTypeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
