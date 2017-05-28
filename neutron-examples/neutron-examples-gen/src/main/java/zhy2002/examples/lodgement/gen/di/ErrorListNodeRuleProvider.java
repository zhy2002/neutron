package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ErrorListNode;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.rule.*;

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

    @Inject
    Provider<ChangeFocusErrorRule> changeFocusErrorRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        ChangeFocusErrorRule changeFocusErrorRule = changeFocusErrorRuleProvider.get();
        createdRules.add(changeFocusErrorRule);
    }

}
