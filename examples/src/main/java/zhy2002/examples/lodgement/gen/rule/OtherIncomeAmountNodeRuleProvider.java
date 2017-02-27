package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.OtherIncomeAmountNode;


@OtherIncomeAmountNodeScope
public class OtherIncomeAmountNodeRuleProvider
    extends BaseCurrencyNodeRuleProvider<OtherIncomeAmountNode> {

    @Inject
    public OtherIncomeAmountNodeRuleProvider() {}

    @Override
    public void initializeState(OtherIncomeAmountNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
