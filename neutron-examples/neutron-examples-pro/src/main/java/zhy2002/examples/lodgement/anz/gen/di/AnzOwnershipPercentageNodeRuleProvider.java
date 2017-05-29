package zhy2002.examples.lodgement.anz.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@OwnershipPercentageNodeScope
public class AnzOwnershipPercentageNodeRuleProvider extends OwnershipPercentageNodeRuleProvider {

    @Inject
    public AnzOwnershipPercentageNodeRuleProvider() {
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
