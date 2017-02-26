package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonTrustSettlorNotRequiredReasonNode;


@PersonTrustSettlorNotRequiredReasonNodeScope
public class PersonTrustSettlorNotRequiredReasonNodeRuleProvider
    extends StringUiNodeRuleProvider<PersonTrustSettlorNotRequiredReasonNode> {

    @Inject
    public PersonTrustSettlorNotRequiredReasonNodeRuleProvider() {}

    @Override
    public void initializeState(PersonTrustSettlorNotRequiredReasonNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
