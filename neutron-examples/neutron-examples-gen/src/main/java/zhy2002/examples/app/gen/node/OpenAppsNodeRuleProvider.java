package zhy2002.examples.app.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.app.gen.node.OpenAppsNode;
import zhy2002.examples.app.gen.di.*;

@ComponentScope
public class OpenAppsNodeRuleProvider implements RuleProvider<OpenAppsNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public OpenAppsNodeRuleProvider() {
    }

    @Override
    public void initializeState(OpenAppsNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
