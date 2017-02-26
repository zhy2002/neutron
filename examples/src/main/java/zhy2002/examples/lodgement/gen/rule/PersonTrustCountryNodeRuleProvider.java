package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonTrustCountryNode;


@PersonTrustCountryNodeScope
public class PersonTrustCountryNodeRuleProvider
    extends BaseCountryNodeRuleProvider<PersonTrustCountryNode> {

    @Inject
    public PersonTrustCountryNodeRuleProvider() {}

    @Override
    public void initializeState(PersonTrustCountryNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
