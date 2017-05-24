package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;

@RelatedPersonReferenceNodeScope
public class RelatedPersonReferenceNodeRuleProvider implements RuleProvider<RelatedPersonReferenceNode> {

    @Inject
    ReferenceUiNodeRuleProvider parentRuleProvider;

    @Inject
    public RelatedPersonReferenceNodeRuleProvider() {
    }

    @Override
    public void initializeState(RelatedPersonReferenceNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
