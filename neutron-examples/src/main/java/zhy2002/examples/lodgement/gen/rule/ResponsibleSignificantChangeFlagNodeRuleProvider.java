package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ResponsibleSignificantChangeFlagNode;


@ResponsibleSignificantChangeFlagNodeScope
public class ResponsibleSignificantChangeFlagNodeRuleProvider
    extends YesNoOptionNodeRuleProvider<ResponsibleSignificantChangeFlagNode> {

    @Inject
    public ResponsibleSignificantChangeFlagNodeRuleProvider() {}

    @Override
    public void initializeState(ResponsibleSignificantChangeFlagNode node) {
    }


    @Inject
    Provider<ResponsibleSignificantChangeRule> responsibleSignificantChangeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(responsibleSignificantChangeRuleProvider.get());
    }

}
