package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CompanyTrustNode;


@CompanyTrustNodeScope
public class CompanyTrustNodeRuleProvider
    extends BaseTrustNodeRuleProvider<CompanyTrustNode> {

    @Inject
    public CompanyTrustNodeRuleProvider() {}

    @Override
    public void initializeState(CompanyTrustNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}