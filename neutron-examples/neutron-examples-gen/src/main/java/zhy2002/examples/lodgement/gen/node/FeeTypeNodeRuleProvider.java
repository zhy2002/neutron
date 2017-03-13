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

@FeeTypeNodeScope
public class FeeTypeNodeRuleProvider implements RuleProvider<FeeTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public FeeTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(FeeTypeNode node) {
        parentRuleProvider.initializeState(node);

        node.setRequired(true);
    }

    @Inject
    Provider<StringEnableSiblingRule> stringEnableSiblingRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

            StringEnableSiblingRule stringEnableSiblingRule = stringEnableSiblingRuleProvider.get();
            stringEnableSiblingRule.setSiblingName("feeDescriptionNode");
            stringEnableSiblingRule.setEnablingValue("Other");
            createdRules.add(stringEnableSiblingRule);
    }

}
