package zhy2002.examples.register.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.RepeatPasswordNode;
import zhy2002.neutron.rule.*;
import zhy2002.examples.register.gen.di.*;
import zhy2002.examples.register.gen.rule.*;

@ComponentScope
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

        RepeatPasswordRule repeatPasswordRule = repeatPasswordRuleProvider.get();
        createdRules.add(repeatPasswordRule);
    }

}
