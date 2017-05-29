package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CompanyAcnNode;
import zhy2002.examples.lodgement.gen.di.*;

@CompanyAcnNodeScope
public class CompanyAcnNodeRuleProvider implements RuleProvider<CompanyAcnNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyAcnNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyAcnNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}