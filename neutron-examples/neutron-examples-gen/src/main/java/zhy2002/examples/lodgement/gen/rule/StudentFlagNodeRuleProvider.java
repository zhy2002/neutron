package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.StudentFlagNode;


@StudentFlagNodeScope
public class StudentFlagNodeRuleProvider
    extends YesNoOptionNodeRuleProvider<StudentFlagNode> {

    @Inject
    public StudentFlagNodeRuleProvider() {}

    @Override
    public void initializeState(StudentFlagNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
