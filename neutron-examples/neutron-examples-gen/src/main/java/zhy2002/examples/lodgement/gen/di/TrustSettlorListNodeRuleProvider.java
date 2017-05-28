package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.TrustSettlorListNode;
import zhy2002.examples.lodgement.gen.di.*;

@TrustSettlorListNodeScope
public class TrustSettlorListNodeRuleProvider implements RuleProvider<TrustSettlorListNode> {

    @Inject
    SelectRelatedPersonListNodeRuleProvider parentRuleProvider;

    @Inject
    public TrustSettlorListNodeRuleProvider() {
    }

    @Override
    public void initializeState(TrustSettlorListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
