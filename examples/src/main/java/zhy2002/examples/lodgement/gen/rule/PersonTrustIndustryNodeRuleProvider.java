package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonTrustIndustryNode;


@PersonTrustIndustryNodeScope
public class PersonTrustIndustryNodeRuleProvider
    extends StringUiNodeRuleProvider<PersonTrustIndustryNode> {

    @Inject
    public PersonTrustIndustryNodeRuleProvider() {}

    @Override
    public void initializeState(PersonTrustIndustryNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
