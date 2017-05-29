package zhy2002.examples.lodgement.bankb.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@OtherLiabilityTypeNodeScope
public class BankBOtherLiabilityTypeNodeRuleProvider extends OtherLiabilityTypeNodeRuleProvider {

    @Inject
    public BankBOtherLiabilityTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherLiabilityTypeNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.OTHER_LIABILITY_TYPE);
        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}