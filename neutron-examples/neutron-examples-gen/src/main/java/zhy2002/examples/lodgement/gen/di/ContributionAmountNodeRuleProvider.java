package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ContributionAmountNode;
import zhy2002.examples.lodgement.gen.di.*;

@ContributionAmountNodeScope
public class ContributionAmountNodeRuleProvider implements RuleProvider<ContributionAmountNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public ContributionAmountNodeRuleProvider() {
    }

    @Override
    public void initializeState(ContributionAmountNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
