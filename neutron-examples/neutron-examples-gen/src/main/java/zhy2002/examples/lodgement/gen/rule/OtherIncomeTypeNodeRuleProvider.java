package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.OtherIncomeTypeNode;


@OtherIncomeTypeNodeScope
public class OtherIncomeTypeNodeRuleProvider
    extends StringUiNodeRuleProvider<OtherIncomeTypeNode> {

    @Inject
    public OtherIncomeTypeNodeRuleProvider() {}

    @Override
    public void initializeState(OtherIncomeTypeNode node) {
    }


    @Inject
    Provider<OtherIncomeTypeChangeRule> otherIncomeTypeChangeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(otherIncomeTypeChangeRuleProvider.get());
    }

}
