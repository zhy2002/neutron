package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.RelatedPersonReferenceNode;


@RelatedPersonReferenceNodeScope
public class RelatedPersonReferenceNodeRuleProvider
    extends ReferenceUiNodeRuleProvider<RelatedPersonReferenceNode> {

    @Inject
    public RelatedPersonReferenceNodeRuleProvider() {}

    @Override
    public void initializeState(RelatedPersonReferenceNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
