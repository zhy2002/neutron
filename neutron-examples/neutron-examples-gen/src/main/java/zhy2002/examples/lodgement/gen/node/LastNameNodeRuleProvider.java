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

@LastNameNodeScope
public class LastNameNodeRuleProvider implements RuleProvider<LastNameNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public LastNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(LastNameNode node) {
        parentRuleProvider.initializeState(node);

        node.setRequired(true);
        node.setPattern(ApplicationNodeConstants.NAME_PATTERN);
        node.setMaxLength(20);
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
