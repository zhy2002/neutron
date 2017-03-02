package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.MortgageLoanTermExpiryDateNode;


@MortgageLoanTermExpiryDateNodeScope
public class MortgageLoanTermExpiryDateNodeRuleProvider
    extends StringUiNodeRuleProvider<MortgageLoanTermExpiryDateNode> {

    @Inject
    public MortgageLoanTermExpiryDateNodeRuleProvider() {}

    @Override
    public void initializeState(MortgageLoanTermExpiryDateNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
