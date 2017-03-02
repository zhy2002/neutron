package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.MortgageTermRemainingPeriodNode;


@MortgageTermRemainingPeriodNodeScope
public class MortgageTermRemainingPeriodNodeRuleProvider
    extends StringUiNodeRuleProvider<MortgageTermRemainingPeriodNode> {

    @Inject
    public MortgageTermRemainingPeriodNodeRuleProvider() {}

    @Override
    public void initializeState(MortgageTermRemainingPeriodNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
