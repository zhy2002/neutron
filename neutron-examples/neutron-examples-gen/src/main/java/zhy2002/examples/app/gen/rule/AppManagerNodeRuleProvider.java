package zhy2002.examples.app.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.app.gen.di.*;
import javax.inject.*;
import zhy2002.examples.app.gen.node.AppManagerNode;


@AppManagerNodeScope
public class AppManagerNodeRuleProvider
    extends ObjectUiNodeRuleProvider<AppManagerNode> {

    @Inject
    public AppManagerNodeRuleProvider() {}

    @Override
    public void initializeState(AppManagerNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
