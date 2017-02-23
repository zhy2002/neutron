package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;

@UnemployedOnBenefitFlagNodeScope
public class UnemployedOnBenefitFlagNodeRuleProvider extends YesNoOptionNodeRuleProvider {

    @Inject
    public UnemployedOnBenefitFlagNodeRuleProvider() {}


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
