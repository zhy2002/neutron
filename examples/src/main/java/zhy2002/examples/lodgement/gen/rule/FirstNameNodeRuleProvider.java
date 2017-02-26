package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.FirstNameNode;


@FirstNameNodeScope
public class FirstNameNodeRuleProvider
    extends StringUiNodeRuleProvider<FirstNameNode> {

    @Inject
    public FirstNameNodeRuleProvider() {}

    @Override
    public void initializeState(FirstNameNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
