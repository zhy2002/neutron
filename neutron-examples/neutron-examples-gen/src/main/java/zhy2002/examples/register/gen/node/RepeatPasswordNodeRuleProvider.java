package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.rule.*;

@RepeatPasswordNodeScope
public class RepeatPasswordNodeRuleProvider implements RuleProvider<RepeatPasswordNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public RepeatPasswordNodeRuleProvider() {
    }

    @Override
    public void initializeState(RepeatPasswordNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<RepeatPasswordRule> repeatPasswordRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
            createdRules.add(repeatPasswordRuleProvider.get());
    }

}
