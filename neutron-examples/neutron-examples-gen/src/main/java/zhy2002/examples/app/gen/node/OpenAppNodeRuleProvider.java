package zhy2002.examples.app.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.app.gen.node.OpenAppNode;
import zhy2002.examples.app.gen.di.*;

@ComponentScope
public class OpenAppNodeRuleProvider implements RuleProvider<OpenAppNode> {

    @Inject
    AnyUiNodeRuleProvider parentRuleProvider;

    @Inject
    public OpenAppNodeRuleProvider() {
    }

    @Override
    public void initializeState(OpenAppNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
