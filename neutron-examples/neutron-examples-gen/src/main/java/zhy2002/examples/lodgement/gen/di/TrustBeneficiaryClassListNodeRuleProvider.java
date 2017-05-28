package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.TrustBeneficiaryClassListNode;
import zhy2002.examples.lodgement.gen.di.*;

@TrustBeneficiaryClassListNodeScope
public class TrustBeneficiaryClassListNodeRuleProvider implements RuleProvider<TrustBeneficiaryClassListNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public TrustBeneficiaryClassListNodeRuleProvider() {
    }

    @Override
    public void initializeState(TrustBeneficiaryClassListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
