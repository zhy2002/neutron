package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.TrustBeneficiaryClassListNode;


@TrustBeneficiaryClassListNodeScope
public class TrustBeneficiaryClassListNodeRuleProvider
    extends ListUiNodeRuleProvider<TrustBeneficiaryClassListNode> {

    @Inject
    public TrustBeneficiaryClassListNodeRuleProvider() {}

    @Override
    public void initializeState(TrustBeneficiaryClassListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
