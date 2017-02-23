package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;

@PasswordNodeScope
public class PasswordNodeRuleProvider extends StringUiNodeRuleProvider {

    @Inject
    public PasswordNodeRuleProvider() {}

    @Inject
    Provider<PasswordIsStrongRule> passwordIsStrongRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(passwordIsStrongRuleProvider.get());
    }

}
