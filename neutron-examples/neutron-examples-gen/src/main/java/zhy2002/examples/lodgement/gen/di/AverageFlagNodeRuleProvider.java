package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.AverageFlagNode;
import zhy2002.examples.lodgement.gen.di.*;

@AverageFlagNodeScope
public class AverageFlagNodeRuleProvider implements RuleProvider<AverageFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public AverageFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(AverageFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
