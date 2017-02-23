package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;

@RepeatPasswordNodeScope
public class RepeatPasswordNodeRuleProvider extends StringUiNodeRuleProvider {

    @Inject
    public RepeatPasswordNodeRuleProvider() {}

    @Inject
    Provider<RepeatPasswordRule> repeatPasswordRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(repeatPasswordRuleProvider.get());
    }

}
