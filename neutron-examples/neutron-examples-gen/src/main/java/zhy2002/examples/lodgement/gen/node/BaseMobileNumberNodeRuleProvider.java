package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


public class BaseMobileNumberNodeRuleProvider implements RuleProvider<BaseMobileNumberNode<?>> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public BaseMobileNumberNodeRuleProvider() {
    }

    @Override
    public void initializeState(BaseMobileNumberNode<?> node) {
        parentRuleProvider.initializeState(node);

        node.setPattern("^(\\+\\d{1,3}[- ]?)?\\d{10}$");
        node.setPatternMessage("Invalid mobile number.");
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
