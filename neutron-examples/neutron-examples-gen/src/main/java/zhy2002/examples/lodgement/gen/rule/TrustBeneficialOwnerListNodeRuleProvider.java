package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.TrustBeneficialOwnerListNode;


@TrustBeneficialOwnerListNodeScope
public class TrustBeneficialOwnerListNodeRuleProvider
    extends SelectAccountHolderListNodeRuleProvider<TrustBeneficialOwnerListNode> {

    @Inject
    public TrustBeneficialOwnerListNodeRuleProvider() {}

    @Override
    public void initializeState(TrustBeneficialOwnerListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
