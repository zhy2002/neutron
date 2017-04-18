package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@FeePayFromNodeScope
public class FeePayFromNodeRuleProvider implements RuleProvider<FeePayFromNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public FeePayFromNodeRuleProvider() {
    }

    @Override
    public void initializeState(FeePayFromNode node) {
        parentRuleProvider.initializeState(node);

        node.setRequired(true);
        node.setOptions(ApplicationNodeConstants.FEE_FROM_TYPE);
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
