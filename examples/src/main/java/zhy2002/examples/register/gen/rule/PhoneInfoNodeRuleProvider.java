package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;

@PhoneInfoNodeScope
public class PhoneInfoNodeRuleProvider extends ObjectUiNodeRuleProvider {

    @Inject
    public PhoneInfoNodeRuleProvider() {}

    @Inject
    Provider<PhoneInfoAllOrNothingRule> phoneInfoAllOrNothingRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(phoneInfoAllOrNothingRuleProvider.get());
    }

}
