package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityListNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class OtherLiabilityListNodeRuleProvider implements RuleProvider<OtherLiabilityListNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public OtherLiabilityListNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherLiabilityListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
