package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.LastNameNode;


@LastNameNodeScope
public class LastNameNodeRuleProvider
    extends StringUiNodeRuleProvider<LastNameNode> {

    @Inject
    public LastNameNodeRuleProvider() {}

    @Override
    public void initializeState(LastNameNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
