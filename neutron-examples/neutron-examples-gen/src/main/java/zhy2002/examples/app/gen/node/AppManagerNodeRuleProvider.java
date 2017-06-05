package zhy2002.examples.app.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.app.gen.node.AppManagerNode;
import zhy2002.examples.app.gen.di.*;
import zhy2002.examples.app.data.*;
import java.math.*;

@ComponentScope
public class AppManagerNodeRuleProvider implements RuleProvider<AppManagerNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public AppManagerNodeRuleProvider() {
    }

    @Override
    public void initializeState(AppManagerNode node) {
        parentRuleProvider.initializeState(node);

        node.setNodeLabel("App Manager");
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
