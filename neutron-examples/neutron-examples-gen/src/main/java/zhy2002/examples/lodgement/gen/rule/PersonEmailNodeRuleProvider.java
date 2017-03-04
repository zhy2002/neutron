package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonEmailNode;


@PersonEmailNodeScope
public class PersonEmailNodeRuleProvider
    extends EmailNodeRuleProvider<PersonEmailNode> {

    @Inject
    public PersonEmailNodeRuleProvider() {}

    @Override
    public void initializeState(PersonEmailNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
