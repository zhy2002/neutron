package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.SelectAccountHolderNode;


@SelectAccountHolderNodeScope
public class SelectAccountHolderNodeRuleProvider
    extends ObjectUiNodeRuleProvider<SelectAccountHolderNode> {

    @Inject
    public SelectAccountHolderNodeRuleProvider() {}

    @Override
    public void initializeState(SelectAccountHolderNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
