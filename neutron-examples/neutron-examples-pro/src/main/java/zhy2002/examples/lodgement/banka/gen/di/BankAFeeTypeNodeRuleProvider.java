package zhy2002.examples.lodgement.banka.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.banka.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@FeeTypeNodeScope
public class BankAFeeTypeNodeRuleProvider extends FeeTypeNodeRuleProvider {

    @Inject
    public BankAFeeTypeNodeRuleProvider() {
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
