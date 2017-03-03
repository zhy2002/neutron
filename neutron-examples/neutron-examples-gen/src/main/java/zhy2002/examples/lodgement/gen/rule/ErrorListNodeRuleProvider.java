package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ErrorListNode;


@ErrorListNodeScope
public class ErrorListNodeRuleProvider
    extends ListUiNodeRuleProvider<ErrorListNode> {

    @Inject
    public ErrorListNodeRuleProvider() {}

    @Override
    public void initializeState(ErrorListNode node) {
    }


    @Inject
    Provider<ChangeFocusErrorRule> changeFocusErrorRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(changeFocusErrorRuleProvider.get());
    }

}
