package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@CompanyTrustNodeScope
public class CompanyTrustNodeRuleProvider implements RuleProvider<CompanyTrustNode> {

    @Inject
    BaseTrustNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyTrustNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyTrustNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
