package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.DateOfBirthNode;


@DateOfBirthNodeScope
public class DateOfBirthNodeRuleProvider
    extends DobNodeRuleProvider<DateOfBirthNode> {

    @Inject
    public DateOfBirthNodeRuleProvider() {}

    @Override
    public void initializeState(DateOfBirthNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}