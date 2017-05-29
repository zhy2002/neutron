package zhy2002.examples.lodgement.cba.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ThirdPartyDescriptionNodeScope
public class CbaThirdPartyDescriptionNodeRuleProvider extends ThirdPartyDescriptionNodeRuleProvider {

    @Inject
    public CbaThirdPartyDescriptionNodeRuleProvider() {
    }

    @Override
    public void initializeState(ThirdPartyDescriptionNode node) {
        super.initializeState(node);

        node.setRequired(true);
        node.setOptions(ApplicationNodeConstants.NEXT_KIN_TYPE);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
