package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ThirdPartyWorkPhoneNode;


@ThirdPartyWorkPhoneNodeScope
public class ThirdPartyWorkPhoneNodeRuleProvider
    extends TelephoneNodeRuleProvider<ThirdPartyWorkPhoneNode> {

    @Inject
    public ThirdPartyWorkPhoneNodeRuleProvider() {}

    @Override
    public void initializeState(ThirdPartyWorkPhoneNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
