package zhy2002.examples.lodgement.anz.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@FeePayFromNodeScope
public class AnzFeePayFromNodeRuleProvider extends FeePayFromNodeRuleProvider {

    @Inject
    public AnzFeePayFromNodeRuleProvider() {
    }

    @Override
    public void initializeState(FeePayFromNode node) {
        super.initializeState(node);

        node.setRequired(true);
        node.setOptions(ApplicationNodeConstants.FEE_FROM_TYPE);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
