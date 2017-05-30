package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.DateLodgedNode;
import zhy2002.examples.lodgement.gen.di.*;

@DateLodgedNodeScope
public class DateLodgedNodeRuleProvider implements RuleProvider<DateLodgedNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public DateLodgedNodeRuleProvider() {
    }

    @Override
    public void initializeState(DateLodgedNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
