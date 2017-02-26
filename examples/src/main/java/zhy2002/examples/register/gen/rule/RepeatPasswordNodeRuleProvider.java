package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.RepeatPasswordNode;


@RepeatPasswordNodeScope
public class RepeatPasswordNodeRuleProvider
    extends StringUiNodeRuleProvider<RepeatPasswordNode> {

    @Inject
    public RepeatPasswordNodeRuleProvider() {}

    @Override
    public void initializeState(RepeatPasswordNode node) {
    }


    @Inject
    Provider<RepeatPasswordRule> repeatPasswordRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(repeatPasswordRuleProvider.get());
    }

}
