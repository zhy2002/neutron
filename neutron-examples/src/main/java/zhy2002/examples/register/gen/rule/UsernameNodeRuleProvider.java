package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.UsernameNode;


@UsernameNodeScope
public class UsernameNodeRuleProvider
    extends StringUiNodeRuleProvider<UsernameNode> {

    @Inject
    public UsernameNodeRuleProvider() {}

    @Override
    public void initializeState(UsernameNode node) {
    }


    @Inject
    Provider<DefaultEmailByUsernameRule> defaultEmailByUsernameRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(defaultEmailByUsernameRuleProvider.get());
    }

}
