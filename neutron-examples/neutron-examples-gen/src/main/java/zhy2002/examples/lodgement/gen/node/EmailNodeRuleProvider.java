package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


public class EmailNodeRuleProvider implements RuleProvider<EmailNode<?>> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public EmailNodeRuleProvider() {
    }

    @Override
    public void initializeState(EmailNode<?> node) {
        parentRuleProvider.initializeState(node);

        node.setPattern("\\w+@\\w+\\.[\\w.]+");
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
    }

}
