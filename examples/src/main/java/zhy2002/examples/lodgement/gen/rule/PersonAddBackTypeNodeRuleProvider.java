package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonAddBackTypeNode;


@PersonAddBackTypeNodeScope
public class PersonAddBackTypeNodeRuleProvider
    extends StringUiNodeRuleProvider<PersonAddBackTypeNode> {

    @Inject
    public PersonAddBackTypeNodeRuleProvider() {}

    @Override
    public void initializeState(PersonAddBackTypeNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}