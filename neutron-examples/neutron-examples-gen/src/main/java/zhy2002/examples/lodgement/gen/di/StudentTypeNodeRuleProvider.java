package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.StudentTypeNode;
import zhy2002.examples.lodgement.gen.di.*;

@StudentTypeNodeScope
public class StudentTypeNodeRuleProvider implements RuleProvider<StudentTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public StudentTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(StudentTypeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
