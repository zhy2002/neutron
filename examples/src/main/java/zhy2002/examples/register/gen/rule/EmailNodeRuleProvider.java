package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;

@EmailNodeScope
public class EmailNodeRuleProvider extends StringUiNodeRuleProvider {

    @Inject
    public EmailNodeRuleProvider() {}

    @Inject
    Provider<EmailChangeReasonRule> emailChangeReasonRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(emailChangeReasonRuleProvider.get());
    }

}
