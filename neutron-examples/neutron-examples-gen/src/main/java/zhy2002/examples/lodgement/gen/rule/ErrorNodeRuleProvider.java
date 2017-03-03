package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ErrorNode;


@ErrorNodeScope
public class ErrorNodeRuleProvider
    extends ValidationErrorUiNodeRuleProvider<ErrorNode> {

    @Inject
    public ErrorNodeRuleProvider() {}

    @Override
    public void initializeState(ErrorNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
