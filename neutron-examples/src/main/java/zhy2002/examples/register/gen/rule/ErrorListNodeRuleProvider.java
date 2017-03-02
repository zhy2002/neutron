package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.ErrorListNode;


@ErrorListNodeScope
public class ErrorListNodeRuleProvider
    extends ListUiNodeRuleProvider<ErrorListNode> {

    @Inject
    public ErrorListNodeRuleProvider() {}

    @Override
    public void initializeState(ErrorListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
