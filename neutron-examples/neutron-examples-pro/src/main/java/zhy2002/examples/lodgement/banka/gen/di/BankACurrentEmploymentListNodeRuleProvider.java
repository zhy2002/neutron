package zhy2002.examples.lodgement.banka.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.banka.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@CurrentEmploymentListNodeScope
public class BankACurrentEmploymentListNodeRuleProvider extends CurrentEmploymentListNodeRuleProvider {

    @Inject
    public BankACurrentEmploymentListNodeRuleProvider() {
    }

    @Override
    public void initializeState(CurrentEmploymentListNode node) {
        super.initializeState(node);

        node.setNodeLabel("Current Employment");
        node.setMinItemCount(1);
    }

    @Inject
    Provider<MinItemCountValidationRule> minItemCountValidationRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        MinItemCountValidationRule minItemCountValidationRule = minItemCountValidationRuleProvider.get();
        createdRules.add(minItemCountValidationRule);
    }

}