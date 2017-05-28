package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.DateOfBirthNode;
import zhy2002.examples.lodgement.gen.di.*;

@DateOfBirthNodeScope
public class DateOfBirthNodeRuleProvider implements RuleProvider<DateOfBirthNode> {

    @Inject
    DobNodeRuleProvider parentRuleProvider;

    @Inject
    public DateOfBirthNodeRuleProvider() {
    }

    @Override
    public void initializeState(DateOfBirthNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
