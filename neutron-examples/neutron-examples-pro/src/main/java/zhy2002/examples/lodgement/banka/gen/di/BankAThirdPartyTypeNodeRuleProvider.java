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


@ThirdPartyTypeNodeScope
public class BankAThirdPartyTypeNodeRuleProvider extends ThirdPartyTypeNodeRuleProvider {

    @Inject
    public BankAThirdPartyTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(ThirdPartyTypeNode node) {
        super.initializeState(node);

        node.setRequired(true);
        node.setOptions(ApplicationNodeConstants.THIRD_PARTY_TYPE);
    }

    @Inject
    Provider<StringEnableSiblingRule> stringEnableSiblingRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        StringEnableSiblingRule stringEnableSiblingRule = stringEnableSiblingRuleProvider.get();
        stringEnableSiblingRule.setSiblingName("thirdPartyDescriptionNode");
        stringEnableSiblingRule.setEnablingValue("Next of Kin");
        createdRules.add(stringEnableSiblingRule);
    }

}
