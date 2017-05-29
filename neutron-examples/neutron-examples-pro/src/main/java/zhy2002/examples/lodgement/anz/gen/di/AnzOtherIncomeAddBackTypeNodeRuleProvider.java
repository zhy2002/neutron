package zhy2002.examples.lodgement.anz.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@OtherIncomeAddBackTypeNodeScope
public class AnzOtherIncomeAddBackTypeNodeRuleProvider extends OtherIncomeAddBackTypeNodeRuleProvider {

    @Inject
    public AnzOtherIncomeAddBackTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherIncomeAddBackTypeNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.OTHER_INCOME_ADD_BACK_TYPE);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
