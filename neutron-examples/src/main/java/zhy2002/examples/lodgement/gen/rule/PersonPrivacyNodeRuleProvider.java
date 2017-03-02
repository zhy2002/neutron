package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonPrivacyNode;


@PersonPrivacyNodeScope
public class PersonPrivacyNodeRuleProvider
    extends BasePrivacyNodeRuleProvider<PersonPrivacyNode> {

    @Inject
    public PersonPrivacyNodeRuleProvider() {}

    @Override
    public void initializeState(PersonPrivacyNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
