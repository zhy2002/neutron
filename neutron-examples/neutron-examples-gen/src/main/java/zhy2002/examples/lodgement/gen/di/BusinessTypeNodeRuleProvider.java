package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.BusinessTypeNode;
import zhy2002.examples.lodgement.gen.di.*;

@BusinessTypeNodeScope
public class BusinessTypeNodeRuleProvider implements RuleProvider<BusinessTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public BusinessTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(BusinessTypeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}