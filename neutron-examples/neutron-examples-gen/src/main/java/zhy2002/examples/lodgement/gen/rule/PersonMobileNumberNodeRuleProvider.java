package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonMobileNumberNode;


@PersonMobileNumberNodeScope
public class PersonMobileNumberNodeRuleProvider
    extends BaseMobileNumberNodeRuleProvider<PersonMobileNumberNode> {

    @Inject
    public PersonMobileNumberNodeRuleProvider() {}

    @Override
    public void initializeState(PersonMobileNumberNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
