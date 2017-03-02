package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.SavingsAccountNoNode;


@SavingsAccountNoNodeScope
public class SavingsAccountNoNodeRuleProvider
    extends StringUiNodeRuleProvider<SavingsAccountNoNode> {

    @Inject
    public SavingsAccountNoNodeRuleProvider() {}

    @Override
    public void initializeState(SavingsAccountNoNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
