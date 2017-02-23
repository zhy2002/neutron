package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;

@RegisterNodeScope
public class RegisterNodeRuleProvider extends ObjectUiNodeRuleProvider {

    @Inject
    public RegisterNodeRuleProvider() {}

    @Inject
    Provider<SetHasErrorRule> setHasErrorRuleProvider;
    @Inject
    Provider<CreateErrorNodeRule> createErrorNodeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(setHasErrorRuleProvider.get());
            createdRules.add(createErrorNodeRuleProvider.get());
    }

}
