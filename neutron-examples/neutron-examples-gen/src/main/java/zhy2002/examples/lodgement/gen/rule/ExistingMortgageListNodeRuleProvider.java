package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ExistingMortgageListNode;


@ExistingMortgageListNodeScope
public class ExistingMortgageListNodeRuleProvider
    extends ListUiNodeRuleProvider<ExistingMortgageListNode> {

    @Inject
    public ExistingMortgageListNodeRuleProvider() {}

    @Override
    public void initializeState(ExistingMortgageListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
