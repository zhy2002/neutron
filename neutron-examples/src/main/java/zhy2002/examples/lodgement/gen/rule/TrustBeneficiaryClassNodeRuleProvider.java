package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.TrustBeneficiaryClassNode;


@TrustBeneficiaryClassNodeScope
public class TrustBeneficiaryClassNodeRuleProvider
    extends StringUiNodeRuleProvider<TrustBeneficiaryClassNode> {

    @Inject
    public TrustBeneficiaryClassNodeRuleProvider() {}

    @Override
    public void initializeState(TrustBeneficiaryClassNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
