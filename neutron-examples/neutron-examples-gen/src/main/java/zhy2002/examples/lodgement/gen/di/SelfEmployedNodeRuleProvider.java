package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.SelfEmployedNode;
import zhy2002.examples.lodgement.gen.di.*;

@SelfEmployedNodeScope
public class SelfEmployedNodeRuleProvider implements RuleProvider<SelfEmployedNode> {

    @Inject
    EmployedNodeRuleProvider parentRuleProvider;

    @Inject
    public SelfEmployedNodeRuleProvider() {
    }

    @Override
    public void initializeState(SelfEmployedNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
