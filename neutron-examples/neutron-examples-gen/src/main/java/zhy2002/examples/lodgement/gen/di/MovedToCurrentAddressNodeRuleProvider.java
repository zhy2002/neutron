package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.MovedToCurrentAddressNode;
import zhy2002.examples.lodgement.gen.di.*;

@MovedToCurrentAddressNodeScope
public class MovedToCurrentAddressNodeRuleProvider implements RuleProvider<MovedToCurrentAddressNode> {

    @Inject
    MonthYearNodeRuleProvider parentRuleProvider;

    @Inject
    public MovedToCurrentAddressNodeRuleProvider() {
    }

    @Override
    public void initializeState(MovedToCurrentAddressNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
