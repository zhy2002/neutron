package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.EmployerNameNode;


@EmployerNameNodeScope
public class EmployerNameNodeRuleProvider
    extends StringUiNodeRuleProvider<EmployerNameNode> {

    @Inject
    public EmployerNameNodeRuleProvider() {}

    @Override
    public void initializeState(EmployerNameNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
