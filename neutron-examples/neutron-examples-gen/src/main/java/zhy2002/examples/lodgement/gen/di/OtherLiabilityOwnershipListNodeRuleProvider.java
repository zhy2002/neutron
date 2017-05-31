package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityOwnershipListNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class OtherLiabilityOwnershipListNodeRuleProvider implements RuleProvider<OtherLiabilityOwnershipListNode> {

    @Inject
    OwnershipListNodeRuleProvider parentRuleProvider;

    @Inject
    public OtherLiabilityOwnershipListNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherLiabilityOwnershipListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
