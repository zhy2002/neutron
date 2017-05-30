package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.SavingsAccountNameNode;
import zhy2002.examples.lodgement.gen.di.*;

@SavingsAccountNameNodeScope
public class SavingsAccountNameNodeRuleProvider implements RuleProvider<SavingsAccountNameNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public SavingsAccountNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(SavingsAccountNameNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
