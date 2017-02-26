package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonOtherIncomePreviousYearNode;


@PersonOtherIncomePreviousYearNodeScope
public class PersonOtherIncomePreviousYearNodeRuleProvider
    extends BooleanUiNodeRuleProvider<PersonOtherIncomePreviousYearNode> {

    @Inject
    public PersonOtherIncomePreviousYearNodeRuleProvider() {}

    @Override
    public void initializeState(PersonOtherIncomePreviousYearNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
