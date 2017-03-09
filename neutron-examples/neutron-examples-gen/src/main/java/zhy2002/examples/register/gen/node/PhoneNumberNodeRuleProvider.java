package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.data.*;
import java.math.*;

@PhoneNumberNodeScope
public class PhoneNumberNodeRuleProvider implements RuleProvider<PhoneNumberNode> {

    @Inject
    PhoneInfoFieldNodeRuleProvider parentRuleProvider;

    @Inject
    public PhoneNumberNodeRuleProvider() {
    }

    @Override
    public void initializeState(PhoneNumberNode node) {
        parentRuleProvider.initializeState(node);

        node.setRequiredMessage("Phone number is required.");
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
