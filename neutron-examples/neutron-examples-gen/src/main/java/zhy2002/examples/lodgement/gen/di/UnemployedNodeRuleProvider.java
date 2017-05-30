package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.UnemployedNode;
import zhy2002.examples.lodgement.gen.di.*;

@UnemployedNodeScope
public class UnemployedNodeRuleProvider implements RuleProvider<UnemployedNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public UnemployedNodeRuleProvider() {
    }

    @Override
    public void initializeState(UnemployedNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
