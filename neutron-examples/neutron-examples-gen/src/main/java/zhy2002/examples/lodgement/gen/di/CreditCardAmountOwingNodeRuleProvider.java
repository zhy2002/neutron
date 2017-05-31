package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.CreditCardAmountOwingNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class CreditCardAmountOwingNodeRuleProvider implements RuleProvider<CreditCardAmountOwingNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public CreditCardAmountOwingNodeRuleProvider() {
    }

    @Override
    public void initializeState(CreditCardAmountOwingNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
