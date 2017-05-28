package zhy2002.examples.register.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.node.PhoneInfoFieldNode;
import zhy2002.examples.register.gen.di.*;


public class PhoneInfoFieldNodeRuleProvider implements RuleProvider<PhoneInfoFieldNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PhoneInfoFieldNodeRuleProvider() {
    }

    @Override
    public void initializeState(PhoneInfoFieldNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
