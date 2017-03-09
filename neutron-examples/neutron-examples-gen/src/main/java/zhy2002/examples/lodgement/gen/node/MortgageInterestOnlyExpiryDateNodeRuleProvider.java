package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

@MortgageInterestOnlyExpiryDateNodeScope
public class MortgageInterestOnlyExpiryDateNodeRuleProvider implements RuleProvider<MortgageInterestOnlyExpiryDateNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public MortgageInterestOnlyExpiryDateNodeRuleProvider() {
    }

    @Override
    public void initializeState(MortgageInterestOnlyExpiryDateNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
