package zhy2002.examples.lodgement.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.MortgageChargePositionNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class MortgageChargePositionNodeRuleProvider implements RuleProvider<MortgageChargePositionNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public MortgageChargePositionNodeRuleProvider() {
    }

    @Override
    public void initializeState(MortgageChargePositionNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
