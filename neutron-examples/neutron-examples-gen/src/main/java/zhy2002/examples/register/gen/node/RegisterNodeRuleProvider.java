package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.rule.*;

@RegisterNodeScope
public class RegisterNodeRuleProvider implements RuleProvider<RegisterNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public RegisterNodeRuleProvider() {
    }

    @Override
    public void initializeState(RegisterNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<SetHasErrorRule> setHasErrorRuleProvider;
    @Inject
    Provider<CreateErrorNodeRule> createErrorNodeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
            createdRules.add(setHasErrorRuleProvider.get());
            createdRules.add(createErrorNodeRuleProvider.get());
    }

}
