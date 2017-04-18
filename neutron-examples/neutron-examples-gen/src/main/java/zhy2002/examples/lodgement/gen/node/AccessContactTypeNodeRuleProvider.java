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

@AccessContactTypeNodeScope
public class AccessContactTypeNodeRuleProvider implements RuleProvider<AccessContactTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public AccessContactTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(AccessContactTypeNode node) {
        parentRuleProvider.initializeState(node);

        node.setOptions(ApplicationNodeConstants.ACCESS_CONTACT_TYPE);
    }

    @Inject
    Provider<StringEnableSiblingRule> stringEnableSiblingRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        StringEnableSiblingRule stringEnableSiblingRule = stringEnableSiblingRuleProvider.get();
        stringEnableSiblingRule.setSiblingName("accessCompanyNameNode");
        stringEnableSiblingRule.setEnablingValue("Selling Agent");
        createdRules.add(stringEnableSiblingRule);
    }

}
