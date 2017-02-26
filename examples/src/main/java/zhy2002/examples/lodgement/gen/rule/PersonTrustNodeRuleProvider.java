package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonTrustNode;


@PersonTrustNodeScope
public class PersonTrustNodeRuleProvider
    extends ObjectUiNodeRuleProvider<PersonTrustNode> {

    @Inject
    public PersonTrustNodeRuleProvider() {}

    @Override
    public void initializeState(PersonTrustNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
