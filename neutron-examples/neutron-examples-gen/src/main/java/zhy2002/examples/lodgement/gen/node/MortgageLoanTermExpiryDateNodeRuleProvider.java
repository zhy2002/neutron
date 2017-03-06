package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

@MortgageLoanTermExpiryDateNodeScope
public class MortgageLoanTermExpiryDateNodeRuleProvider implements RuleProvider<MortgageLoanTermExpiryDateNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public MortgageLoanTermExpiryDateNodeRuleProvider() {
    }

    @Override
    public void initializeState(MortgageLoanTermExpiryDateNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
    }

}
