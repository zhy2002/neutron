package zhy2002.examples.lodgement.bankb.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankb.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@ResponsibleSignificantChangeFlagNodeScope
public class BankBResponsibleSignificantChangeFlagNodeRuleProvider extends ResponsibleSignificantChangeFlagNodeRuleProvider {

    @Inject
    public BankBResponsibleSignificantChangeFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(ResponsibleSignificantChangeFlagNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Inject
    Provider<ResponsibleSignificantChangeRule> responsibleSignificantChangeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        ResponsibleSignificantChangeRule responsibleSignificantChangeRule = responsibleSignificantChangeRuleProvider.get();
        createdRules.add(responsibleSignificantChangeRule);
    }

}
