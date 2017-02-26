package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonTrustNameNode;


@PersonTrustNameNodeScope
public class PersonTrustNameNodeRuleProvider
    extends StringUiNodeRuleProvider<PersonTrustNameNode> {

    @Inject
    public PersonTrustNameNodeRuleProvider() {}

    @Override
    public void initializeState(PersonTrustNameNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
