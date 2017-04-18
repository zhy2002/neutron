package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@ApplicationTypeNodeScope
public class ApplicationTypeNodeRuleProvider implements RuleProvider<ApplicationTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ApplicationTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(ApplicationTypeNode node) {
        parentRuleProvider.initializeState(node);

        node.setOptions(ApplicationNodeConstants.APPLICATION_TYPE);
        node.setRequired(true);
    }

    @Inject
    Provider<ChangeApplicationTypeRule> changeApplicationTypeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        ChangeApplicationTypeRule changeApplicationTypeRule = changeApplicationTypeRuleProvider.get();
        createdRules.add(changeApplicationTypeRule);
    }

}
