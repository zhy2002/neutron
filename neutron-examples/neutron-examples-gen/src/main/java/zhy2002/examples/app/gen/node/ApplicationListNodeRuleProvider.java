package zhy2002.examples.app.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.app.gen.di.*;
import javax.inject.*;
import zhy2002.examples.app.gen.rule.*;
import zhy2002.neutron.rule.*;

@ApplicationListNodeScope
public class ApplicationListNodeRuleProvider implements RuleProvider<ApplicationListNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ApplicationListNodeRuleProvider() {
    }

    @Override
    public void initializeState(ApplicationListNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
