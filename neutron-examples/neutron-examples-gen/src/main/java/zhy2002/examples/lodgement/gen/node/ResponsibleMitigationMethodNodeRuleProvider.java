package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@ResponsibleMitigationMethodNodeScope
public class ResponsibleMitigationMethodNodeRuleProvider implements RuleProvider<ResponsibleMitigationMethodNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ResponsibleMitigationMethodNodeRuleProvider() {
    }

    @Override
    public void initializeState(ResponsibleMitigationMethodNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
