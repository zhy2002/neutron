package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CompanyTypeNode;
import zhy2002.examples.lodgement.gen.di.*;

@CompanyTypeNodeScope
public class CompanyTypeNodeRuleProvider implements RuleProvider<CompanyTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyTypeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}