package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.rule.*;

@ErrorListNodeScope
public class ErrorListNodeRuleProvider implements RuleProvider<ErrorListNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ErrorListNodeRuleProvider() {
    }

    @Override
    public void initializeState(ErrorListNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
    }

}
