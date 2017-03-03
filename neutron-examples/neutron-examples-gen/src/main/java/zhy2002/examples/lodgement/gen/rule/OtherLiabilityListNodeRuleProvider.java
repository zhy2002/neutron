package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityListNode;


@OtherLiabilityListNodeScope
public class OtherLiabilityListNodeRuleProvider
    extends ListUiNodeRuleProvider<OtherLiabilityListNode> {

    @Inject
    public OtherLiabilityListNodeRuleProvider() {}

    @Override
    public void initializeState(OtherLiabilityListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
