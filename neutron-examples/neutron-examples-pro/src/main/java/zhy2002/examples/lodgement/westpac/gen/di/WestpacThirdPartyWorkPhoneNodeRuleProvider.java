package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ThirdPartyWorkPhoneNodeScope
public class WestpacThirdPartyWorkPhoneNodeRuleProvider extends ThirdPartyWorkPhoneNodeRuleProvider {

    @Inject
    public WestpacThirdPartyWorkPhoneNodeRuleProvider() {
    }

    @Override
    public void initializeState(ThirdPartyWorkPhoneNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
