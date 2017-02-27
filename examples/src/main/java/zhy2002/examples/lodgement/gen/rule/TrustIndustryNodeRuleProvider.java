package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.TrustIndustryNode;


@TrustIndustryNodeScope
public class TrustIndustryNodeRuleProvider
    extends StringUiNodeRuleProvider<TrustIndustryNode> {

    @Inject
    public TrustIndustryNodeRuleProvider() {}

    @Override
    public void initializeState(TrustIndustryNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
