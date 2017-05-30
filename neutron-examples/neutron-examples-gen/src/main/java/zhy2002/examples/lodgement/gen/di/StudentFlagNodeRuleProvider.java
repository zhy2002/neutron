package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.StudentFlagNode;
import zhy2002.examples.lodgement.gen.di.*;

@StudentFlagNodeScope
public class StudentFlagNodeRuleProvider implements RuleProvider<StudentFlagNode> {

    @Inject
    YesNoOptionNodeRuleProvider parentRuleProvider;

    @Inject
    public StudentFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(StudentFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
