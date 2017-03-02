package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.PhoneInfoNode;


@PhoneInfoNodeScope
public class PhoneInfoNodeRuleProvider
    extends ObjectUiNodeRuleProvider<PhoneInfoNode> {

    @Inject
    public PhoneInfoNodeRuleProvider() {}

    @Override
    public void initializeState(PhoneInfoNode node) {
    }


    @Inject
    Provider<PhoneInfoAllOrNothingRule> phoneInfoAllOrNothingRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(phoneInfoAllOrNothingRuleProvider.get());
    }

}
