package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.TotalExpenseNode;


@TotalExpenseNodeScope
public class TotalExpenseNodeRuleProvider
    extends BaseCurrencyNodeRuleProvider<TotalExpenseNode> {

    @Inject
    public TotalExpenseNodeRuleProvider() {}

    @Override
    public void initializeState(TotalExpenseNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
