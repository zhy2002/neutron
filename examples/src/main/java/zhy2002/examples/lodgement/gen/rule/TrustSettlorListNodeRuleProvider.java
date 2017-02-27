package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.TrustSettlorListNode;


@TrustSettlorListNodeScope
public class TrustSettlorListNodeRuleProvider
    extends SelectAccountHolderListNodeRuleProvider<TrustSettlorListNode> {

    @Inject
    public TrustSettlorListNodeRuleProvider() {}

    @Override
    public void initializeState(TrustSettlorListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
