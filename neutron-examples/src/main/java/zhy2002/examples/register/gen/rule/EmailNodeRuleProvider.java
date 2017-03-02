package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.EmailNode;


@EmailNodeScope
public class EmailNodeRuleProvider
    extends StringUiNodeRuleProvider<EmailNode> {

    @Inject
    public EmailNodeRuleProvider() {}

    @Override
    public void initializeState(EmailNode node) {
    }


    @Inject
    Provider<EmailChangeReasonRule> emailChangeReasonRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(emailChangeReasonRuleProvider.get());
    }

}
