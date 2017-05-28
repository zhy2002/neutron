package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.PersonPrivacyNode;
import zhy2002.examples.lodgement.gen.di.*;

@PersonPrivacyNodeScope
public class PersonPrivacyNodeRuleProvider implements RuleProvider<PersonPrivacyNode> {

    @Inject
    BasePrivacyNodeRuleProvider parentRuleProvider;

    @Inject
    public PersonPrivacyNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonPrivacyNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
