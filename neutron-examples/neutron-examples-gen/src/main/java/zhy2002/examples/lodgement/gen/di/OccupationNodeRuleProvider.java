package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.OccupationNode;
import zhy2002.examples.lodgement.gen.di.*;

@OccupationNodeScope
public class OccupationNodeRuleProvider implements RuleProvider<OccupationNode> {

    @Inject
    BaseOccupationNodeRuleProvider parentRuleProvider;

    @Inject
    public OccupationNodeRuleProvider() {
    }

    @Override
    public void initializeState(OccupationNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
