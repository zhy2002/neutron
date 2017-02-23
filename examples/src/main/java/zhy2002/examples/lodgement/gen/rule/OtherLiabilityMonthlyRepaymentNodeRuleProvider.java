package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;

@OtherLiabilityMonthlyRepaymentNodeScope
public class OtherLiabilityMonthlyRepaymentNodeRuleProvider extends BaseCurrencyNodeRuleProvider {

    @Inject
    public OtherLiabilityMonthlyRepaymentNodeRuleProvider() {}


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
