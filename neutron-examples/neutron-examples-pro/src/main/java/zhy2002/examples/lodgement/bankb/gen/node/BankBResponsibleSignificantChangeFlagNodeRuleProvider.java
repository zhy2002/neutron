package zhy2002.examples.lodgement.bankb.gen.node;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankb.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@ComponentScope
public class BankBResponsibleSignificantChangeFlagNodeRuleProvider extends ResponsibleSignificantChangeFlagNodeRuleProvider {

    @Inject
    public BankBResponsibleSignificantChangeFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(ResponsibleSignificantChangeFlagNode node) {
        super.initializeState(node);

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
