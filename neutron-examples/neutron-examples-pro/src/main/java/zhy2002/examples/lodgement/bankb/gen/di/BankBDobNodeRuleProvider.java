package zhy2002.examples.lodgement.bankb.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankb.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;



public class BankBDobNodeRuleProvider extends DobNodeRuleProvider {

    @Inject
    public BankBDobNodeRuleProvider() {
    }

    @Override
    public void initializeState(DobNode<?> node) {
        super.initializeState(node);

        node.setMinAge(18);
        node.setMaxAge(100);
    }

    @Inject
    Provider<DobRangeValidationRule> dobRangeValidationRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        DobRangeValidationRule dobRangeValidationRule = dobRangeValidationRuleProvider.get();
        createdRules.add(dobRangeValidationRule);
    }

}
