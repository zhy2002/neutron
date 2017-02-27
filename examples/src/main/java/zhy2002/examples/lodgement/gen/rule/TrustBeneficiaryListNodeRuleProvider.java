package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.TrustBeneficiaryListNode;


@TrustBeneficiaryListNodeScope
public class TrustBeneficiaryListNodeRuleProvider
    extends SelectAccountHolderListNodeRuleProvider<TrustBeneficiaryListNode> {

    @Inject
    public TrustBeneficiaryListNodeRuleProvider() {}

    @Override
    public void initializeState(TrustBeneficiaryListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
