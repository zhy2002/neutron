package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonNode;


@PersonNodeScope
public class PersonNodeRuleProvider
    extends ObjectUiNodeRuleProvider<PersonNode> {

    @Inject
    public PersonNodeRuleProvider() {}

    @Override
    public void initializeState(PersonNode node) {
    }


    @Inject
    Provider<UpdatePersonNodeLabelRule> updatePersonNodeLabelRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(updatePersonNodeLabelRuleProvider.get());
    }

}
