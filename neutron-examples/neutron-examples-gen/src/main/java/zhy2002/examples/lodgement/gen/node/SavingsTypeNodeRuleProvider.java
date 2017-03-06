package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@SavingsTypeNodeScope
public class SavingsTypeNodeRuleProvider implements RuleProvider<SavingsTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public SavingsTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(SavingsTypeNode node) {
        parentRuleProvider.initializeState(node);

        node.setOptions(ApplicationNodeConstants.SAVINGS_ACCOUNT_TYPE.toArray());
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
    }

}
