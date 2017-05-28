package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.EmployerNameNode;
import zhy2002.examples.lodgement.gen.di.*;

@EmployerNameNodeScope
public class EmployerNameNodeRuleProvider implements RuleProvider<EmployerNameNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public EmployerNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(EmployerNameNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
