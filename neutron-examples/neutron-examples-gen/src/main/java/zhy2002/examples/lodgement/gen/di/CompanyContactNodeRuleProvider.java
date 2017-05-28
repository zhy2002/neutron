package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CompanyContactNode;
import zhy2002.examples.lodgement.gen.di.*;

@CompanyContactNodeScope
public class CompanyContactNodeRuleProvider implements RuleProvider<CompanyContactNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyContactNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyContactNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
