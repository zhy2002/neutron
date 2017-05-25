package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@ThirdPartyCompanyNameNodeScope
public class ThirdPartyCompanyNameNodeRuleProvider implements RuleProvider<ThirdPartyCompanyNameNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ThirdPartyCompanyNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(ThirdPartyCompanyNameNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
