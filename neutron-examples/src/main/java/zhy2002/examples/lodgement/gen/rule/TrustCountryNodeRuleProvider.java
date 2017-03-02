package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.TrustCountryNode;


@TrustCountryNodeScope
public class TrustCountryNodeRuleProvider
    extends BaseCountryNodeRuleProvider<TrustCountryNode> {

    @Inject
    public TrustCountryNodeRuleProvider() {}

    @Override
    public void initializeState(TrustCountryNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
