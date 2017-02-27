package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.RelatedPartyListNode;


@RelatedPartyListNodeScope
public class RelatedPartyListNodeRuleProvider
    extends ListUiNodeRuleProvider<RelatedPartyListNode> {

    @Inject
    public RelatedPartyListNodeRuleProvider() {}

    @Override
    public void initializeState(RelatedPartyListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
