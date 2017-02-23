package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;

@OtherLiabilityAmountOwningNodeScope
public class OtherLiabilityAmountOwningNodeRuleProvider extends BaseCurrencyNodeRuleProvider {

    @Inject
    public OtherLiabilityAmountOwningNodeRuleProvider() {}


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
