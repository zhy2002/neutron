package zhy2002.examples.register.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.UsernameNode;
import zhy2002.neutron.rule.*;
import zhy2002.examples.register.gen.di.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.data.*;
import java.math.*;

@ComponentScope
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
    @Inject
    Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        DefaultEmailByUsernameRule defaultEmailByUsernameRule = defaultEmailByUsernameRuleProvider.get();
        createdRules.add(defaultEmailByUsernameRule);
        InvalidCharPreChangeRule invalidCharPreChangeRule = invalidCharPreChangeRuleProvider.get();
        createdRules.add(invalidCharPreChangeRule);
    }

}
