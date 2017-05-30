package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.OtherIncomeAddBackTypeNode;
import zhy2002.examples.lodgement.gen.di.*;

@OtherIncomeAddBackTypeNodeScope
public class OtherIncomeAddBackTypeNodeRuleProvider implements RuleProvider<OtherIncomeAddBackTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public OtherIncomeAddBackTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherIncomeAddBackTypeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
