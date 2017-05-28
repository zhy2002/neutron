package zhy2002.examples.register.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.node.PasswordNode;
import zhy2002.neutron.rule.*;
import zhy2002.examples.register.gen.di.*;
import zhy2002.examples.register.gen.rule.*;

@PasswordNodeScope
public class PasswordNodeRuleProvider implements RuleProvider<PasswordNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PasswordNodeRuleProvider() {
    }

    @Override
    public void initializeState(PasswordNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<PasswordIsStrongRule> passwordIsStrongRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        PasswordIsStrongRule passwordIsStrongRule = passwordIsStrongRuleProvider.get();
        createdRules.add(passwordIsStrongRule);
    }

}
