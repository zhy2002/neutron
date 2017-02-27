package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ThirdPartyCompanyNameNode;


@ThirdPartyCompanyNameNodeScope
public class ThirdPartyCompanyNameNodeRuleProvider
    extends StringUiNodeRuleProvider<ThirdPartyCompanyNameNode> {

    @Inject
    public ThirdPartyCompanyNameNodeRuleProvider() {}

    @Override
    public void initializeState(ThirdPartyCompanyNameNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
