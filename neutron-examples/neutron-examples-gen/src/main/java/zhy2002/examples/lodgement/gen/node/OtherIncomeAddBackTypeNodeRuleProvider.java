package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@OtherIncomeAddBackTypeNodeScope
public class OtherIncomeAddBackTypeNodeRuleProvider implements RuleProvider<OtherIncomeAddBackTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public OtherIncomeAddBackTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherIncomeAddBackTypeNode node) {
        parentRuleProvider.initializeState(node);

        node.setOptions(ApplicationNodeConstants.OTHER_INCOME_ADD_BACK_TYPE.toArray());
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
