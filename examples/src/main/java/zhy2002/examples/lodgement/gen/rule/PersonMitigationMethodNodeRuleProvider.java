package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonMitigationMethodNode;


@PersonMitigationMethodNodeScope
public class PersonMitigationMethodNodeRuleProvider
    extends StringUiNodeRuleProvider<PersonMitigationMethodNode> {

    @Inject
    public PersonMitigationMethodNodeRuleProvider() {}

    @Override
    public void initializeState(PersonMitigationMethodNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
