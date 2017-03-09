package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.rule.*;


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