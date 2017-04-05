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

@EmailNodeScope
public class EmailNodeRuleProvider implements RuleProvider<EmailNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public EmailNodeRuleProvider() {
    }

    @Override
    public void initializeState(EmailNode node) {
        parentRuleProvider.initializeState(node);

        node.setPattern("\\w+@\\w+\\.[\\w.]+");
        node.setPatternMessage("Email format is invalid.");
        node.setRequiredMessage("Email is required.");
    }

    @Inject
    Provider<EmailChangeReasonRule> emailChangeReasonRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        EmailChangeReasonRule emailChangeReasonRule = emailChangeReasonRuleProvider.get();
        createdRules.add(emailChangeReasonRule);
    }

}
