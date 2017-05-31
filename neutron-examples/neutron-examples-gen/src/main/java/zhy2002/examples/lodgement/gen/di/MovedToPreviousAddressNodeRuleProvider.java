package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.MovedToPreviousAddressNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class MovedToPreviousAddressNodeRuleProvider implements RuleProvider<MovedToPreviousAddressNode> {

    @Inject
    MonthYearNodeRuleProvider parentRuleProvider;

    @Inject
    public MovedToPreviousAddressNodeRuleProvider() {
    }

    @Override
    public void initializeState(MovedToPreviousAddressNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
