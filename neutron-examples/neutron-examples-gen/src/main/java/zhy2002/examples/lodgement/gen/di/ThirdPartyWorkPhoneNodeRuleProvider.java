package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ThirdPartyWorkPhoneNode;
import zhy2002.examples.lodgement.gen.di.*;

@ThirdPartyWorkPhoneNodeScope
public class ThirdPartyWorkPhoneNodeRuleProvider implements RuleProvider<ThirdPartyWorkPhoneNode> {

    @Inject
    TelephoneNodeRuleProvider parentRuleProvider;

    @Inject
    public ThirdPartyWorkPhoneNodeRuleProvider() {
    }

    @Override
    public void initializeState(ThirdPartyWorkPhoneNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
