package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@MortgageTermRemainingPeriodNodeScope
public class WestpacMortgageTermRemainingPeriodNodeRuleProvider extends MortgageTermRemainingPeriodNodeRuleProvider {

    @Inject
    public WestpacMortgageTermRemainingPeriodNodeRuleProvider() {
    }

    @Override
    public void initializeState(MortgageTermRemainingPeriodNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
