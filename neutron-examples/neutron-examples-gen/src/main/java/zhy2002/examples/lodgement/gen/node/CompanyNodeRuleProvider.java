package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@CompanyNodeScope
public class CompanyNodeRuleProvider implements RuleProvider<CompanyNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyNode node) {
        parentRuleProvider.initializeState(node);

        node.setSelectedName("companyGeneralNode");
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
