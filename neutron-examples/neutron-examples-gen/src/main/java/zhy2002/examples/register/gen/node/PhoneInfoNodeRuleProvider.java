package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.neutron.rule.*;

@PhoneInfoNodeScope
public class PhoneInfoNodeRuleProvider implements RuleProvider<PhoneInfoNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PhoneInfoNodeRuleProvider() {
    }

    @Override
    public void initializeState(PhoneInfoNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<PhoneInfoAllOrNothingRule> phoneInfoAllOrNothingRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

            createdRules.add(phoneInfoAllOrNothingRuleProvider.get());
    }

}
