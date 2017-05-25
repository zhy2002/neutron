package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@ResponsibleTypeOfChangeNodeScope
public class ResponsibleTypeOfChangeNodeRuleProvider implements RuleProvider<ResponsibleTypeOfChangeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ResponsibleTypeOfChangeNodeRuleProvider() {
    }

    @Override
    public void initializeState(ResponsibleTypeOfChangeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
