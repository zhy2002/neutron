package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.ProfitPreviousYearNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class ProfitPreviousYearNodeRuleProvider implements RuleProvider<ProfitPreviousYearNode> {

    @Inject
    BigDecimalUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProfitPreviousYearNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProfitPreviousYearNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
