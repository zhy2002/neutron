package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.RegisterNode;


@RegisterNodeScope
public class RegisterNodeRuleProvider
    extends ObjectUiNodeRuleProvider<RegisterNode> {

    @Inject
    public RegisterNodeRuleProvider() {}

    @Override
    public void initializeState(RegisterNode node) {
    }


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
