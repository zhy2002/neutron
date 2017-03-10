package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.neutron.rule.*;

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

            createdRules.add(passwordIsStrongRuleProvider.get());
    }

}
