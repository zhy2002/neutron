package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CompanyMobileNumberNode;
import zhy2002.examples.lodgement.gen.di.*;

@CompanyMobileNumberNodeScope
public class CompanyMobileNumberNodeRuleProvider implements RuleProvider<CompanyMobileNumberNode> {

    @Inject
    BaseMobileNumberNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyMobileNumberNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyMobileNumberNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}