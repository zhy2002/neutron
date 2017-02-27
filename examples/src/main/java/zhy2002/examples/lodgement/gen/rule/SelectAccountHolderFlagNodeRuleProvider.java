package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.SelectAccountHolderFlagNode;


@SelectAccountHolderFlagNodeScope
public class SelectAccountHolderFlagNodeRuleProvider
    extends BooleanUiNodeRuleProvider<SelectAccountHolderFlagNode> {

    @Inject
    public SelectAccountHolderFlagNodeRuleProvider() {}

    @Override
    public void initializeState(SelectAccountHolderFlagNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
