package zhy2002.examples.app.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.app.gen.node.AppManagerNode;
import zhy2002.examples.app.gen.di.*;

@AppManagerNodeScope
public class AppManagerNodeRuleProvider implements RuleProvider<AppManagerNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public AppManagerNodeRuleProvider() {
    }

    @Override
    public void initializeState(AppManagerNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
