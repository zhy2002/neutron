package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.register.data.*;
import java.math.*;

@UsernameNodeScope
public class UsernameNodeRuleProvider implements RuleProvider<UsernameNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public UsernameNodeRuleProvider() {
    }

    @Override
    public void initializeState(UsernameNode node) {
        parentRuleProvider.initializeState(node);

        node.setMinLength(4);
        node.setInvalidChars("#");
        node.setLengthMessage("Username must have at least four characters.");
        node.setInvalidCharsMessage("Username cannot contain '#'.");
    }

    @Inject
    Provider<DefaultEmailByUsernameRule> defaultEmailByUsernameRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

            createdRules.add(defaultEmailByUsernameRuleProvider.get());
    }

}
