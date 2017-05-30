package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.DateUpdatedNode;
import zhy2002.examples.lodgement.gen.di.*;

@DateUpdatedNodeScope
public class DateUpdatedNodeRuleProvider implements RuleProvider<DateUpdatedNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public DateUpdatedNodeRuleProvider() {
    }

    @Override
    public void initializeState(DateUpdatedNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
