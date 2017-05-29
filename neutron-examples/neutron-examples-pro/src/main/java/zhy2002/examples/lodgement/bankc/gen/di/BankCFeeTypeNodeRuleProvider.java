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


@FeeTypeNodeScope
public class BankCFeeTypeNodeRuleProvider extends FeeTypeNodeRuleProvider {

    @Inject
    public BankCFeeTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(FeeTypeNode node) {
        super.initializeState(node);

        node.setRequired(true);
        node.setOptions(ApplicationNodeConstants.PRODUCT_FEE_TYPE);
    }

    @Inject
    Provider<StringEnableSiblingRule> stringEnableSiblingRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        StringEnableSiblingRule stringEnableSiblingRule = stringEnableSiblingRuleProvider.get();
        stringEnableSiblingRule.setSiblingName("feeDescriptionNode");
        stringEnableSiblingRule.setEnablingValue("Other");
        createdRules.add(stringEnableSiblingRule);
    }

}