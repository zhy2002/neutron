package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.SavingsAccountNameNode;


@SavingsAccountNameNodeScope
public class SavingsAccountNameNodeRuleProvider
    extends StringUiNodeRuleProvider<SavingsAccountNameNode> {

    @Inject
    public SavingsAccountNameNodeRuleProvider() {}

    @Override
    public void initializeState(SavingsAccountNameNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
