package zhy2002.examples.lodgement.bankc.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankc.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@ThirdPartyDisclosureFlagNodeScope
public class BankCThirdPartyDisclosureFlagNodeRuleProvider extends ThirdPartyDisclosureFlagNodeRuleProvider {

    @Inject
    public BankCThirdPartyDisclosureFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(ThirdPartyDisclosureFlagNode node) {
        super.initializeState(node);

        node.setFixedValue(true);
    }

    @Inject
    Provider<BooleanFixedValueValidationRule> booleanFixedValueValidationRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        BooleanFixedValueValidationRule booleanFixedValueValidationRule = booleanFixedValueValidationRuleProvider.get();
        createdRules.add(booleanFixedValueValidationRule);
    }

}
