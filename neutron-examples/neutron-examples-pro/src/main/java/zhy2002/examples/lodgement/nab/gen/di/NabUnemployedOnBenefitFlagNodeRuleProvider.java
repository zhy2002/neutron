package zhy2002.examples.lodgement.nab.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@UnemployedOnBenefitFlagNodeScope
public class NabUnemployedOnBenefitFlagNodeRuleProvider extends UnemployedOnBenefitFlagNodeRuleProvider {

    @Inject
    public NabUnemployedOnBenefitFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(UnemployedOnBenefitFlagNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
