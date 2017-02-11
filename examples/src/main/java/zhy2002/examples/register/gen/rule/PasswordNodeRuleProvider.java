package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class PasswordNodeRuleProvider implements RuleProvider<PasswordNode> {

    @Inject
    public PasswordNodeRuleProvider() {}

    @Inject
    MembersInjector<PasswordIsStrongRule> passwordIsStrongRuleInjector;

    @Override
    public List<UiNodeRule<PasswordNode>> createRules(PasswordNode node) {
        List<UiNodeRule<PasswordNode>> rules = new ArrayList<>();
        rules.add(createPasswordIsStrongRule(node));
        return rules;
    }

    private PasswordIsStrongRule createPasswordIsStrongRule(PasswordNode node) {
        PasswordIsStrongRule rule = newPasswordIsStrongRule(node);
        passwordIsStrongRuleInjector.injectMembers(rule);
        return rule;
    }


    protected PasswordIsStrongRule newPasswordIsStrongRule(PasswordNode node) {
        return new PasswordIsStrongRuleImpl(node);
    }
}
