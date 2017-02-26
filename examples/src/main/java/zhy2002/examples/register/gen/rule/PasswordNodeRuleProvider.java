package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.PasswordNode;


@PasswordNodeScope
public class PasswordNodeRuleProvider
    extends StringUiNodeRuleProvider<PasswordNode> {

    @Inject
    public PasswordNodeRuleProvider() {}

    @Override
    public void initializeState(PasswordNode node) {
    }


    @Inject
    Provider<PasswordIsStrongRule> passwordIsStrongRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(passwordIsStrongRuleProvider.get());
    }

}
