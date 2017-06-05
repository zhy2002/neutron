package zhy2002.examples.lodgement.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.CreditCheckFlagNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class CreditCheckFlagNodeRuleProvider implements RuleProvider<CreditCheckFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public CreditCheckFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(CreditCheckFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}