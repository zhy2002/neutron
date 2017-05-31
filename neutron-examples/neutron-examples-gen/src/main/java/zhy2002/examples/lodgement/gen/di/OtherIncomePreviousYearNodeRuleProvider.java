package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.OtherIncomePreviousYearNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class OtherIncomePreviousYearNodeRuleProvider implements RuleProvider<OtherIncomePreviousYearNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public OtherIncomePreviousYearNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherIncomePreviousYearNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
