package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.westpac.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@AccessContactTypeNodeScope
public class WestpacAccessContactTypeNodeRuleProvider extends AccessContactTypeNodeRuleProvider {

    @Inject
    public WestpacAccessContactTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(AccessContactTypeNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.ACCESS_CONTACT_TYPE);
    }

    @Inject
    Provider<StringEnableSiblingRule> stringEnableSiblingRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        StringEnableSiblingRule stringEnableSiblingRule = stringEnableSiblingRuleProvider.get();
        stringEnableSiblingRule.setSiblingName("accessCompanyNameNode");
        stringEnableSiblingRule.setEnablingValue("Selling Agent");
        createdRules.add(stringEnableSiblingRule);
    }

}
