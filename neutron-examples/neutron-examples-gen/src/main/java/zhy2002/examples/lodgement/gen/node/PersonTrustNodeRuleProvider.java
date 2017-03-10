package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;

@PersonTrustNodeScope
public class PersonTrustNodeRuleProvider implements RuleProvider<PersonTrustNode> {

    @Inject
    BaseTrustNodeRuleProvider parentRuleProvider;

    @Inject
    public PersonTrustNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonTrustNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
