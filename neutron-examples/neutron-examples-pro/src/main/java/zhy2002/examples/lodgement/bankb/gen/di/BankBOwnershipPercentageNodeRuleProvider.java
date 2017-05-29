package zhy2002.examples.lodgement.bankb.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@OwnershipPercentageNodeScope
public class BankBOwnershipPercentageNodeRuleProvider extends OwnershipPercentageNodeRuleProvider {

    @Inject
    public BankBOwnershipPercentageNodeRuleProvider() {
    }

    @Override
    public void initializeState(OwnershipPercentageNode node) {
        super.initializeState(node);

        node.setValue(new BigDecimal("0"));
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
