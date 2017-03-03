package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.SavingsTypeNode;


@SavingsTypeNodeScope
public class SavingsTypeNodeRuleProvider
    extends StringUiNodeRuleProvider<SavingsTypeNode> {

    @Inject
    public SavingsTypeNodeRuleProvider() {}

    @Override
    public void initializeState(SavingsTypeNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
