package zhy2002.examples.lodgement.cba.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@MortgageInterestOnlyExpiryDateNodeScope
public class CbaMortgageInterestOnlyExpiryDateNodeRuleProvider extends MortgageInterestOnlyExpiryDateNodeRuleProvider {

    @Inject
    public CbaMortgageInterestOnlyExpiryDateNodeRuleProvider() {
    }

    @Override
    public void initializeState(MortgageInterestOnlyExpiryDateNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
