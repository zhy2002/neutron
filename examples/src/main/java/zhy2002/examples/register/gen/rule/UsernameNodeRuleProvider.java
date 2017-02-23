package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;

@UsernameNodeScope
public class UsernameNodeRuleProvider extends StringUiNodeRuleProvider {

    @Inject
    public UsernameNodeRuleProvider() {}

    @Inject
    Provider<DefaultEmailByUsernameRule> defaultEmailByUsernameRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(defaultEmailByUsernameRuleProvider.get());
    }

}
