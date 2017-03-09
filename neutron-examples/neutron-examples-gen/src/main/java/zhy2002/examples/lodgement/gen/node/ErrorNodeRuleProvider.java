package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ErrorNodeScope
public class ErrorNodeRuleProvider implements RuleProvider<ErrorNode> {

    @Inject
    ValidationErrorUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ErrorNodeRuleProvider() {
    }

    @Override
    public void initializeState(ErrorNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}