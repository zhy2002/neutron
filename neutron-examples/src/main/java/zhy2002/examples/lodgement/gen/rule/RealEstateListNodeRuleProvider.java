package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.RealEstateListNode;


@RealEstateListNodeScope
public class RealEstateListNodeRuleProvider
    extends ListUiNodeRuleProvider<RealEstateListNode> {

    @Inject
    public RealEstateListNodeRuleProvider() {}

    @Override
    public void initializeState(RealEstateListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
