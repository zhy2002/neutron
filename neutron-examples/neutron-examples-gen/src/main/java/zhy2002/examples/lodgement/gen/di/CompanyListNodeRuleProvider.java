package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CompanyListNode;
import zhy2002.examples.lodgement.gen.di.*;

@CompanyListNodeScope
public class CompanyListNodeRuleProvider implements RuleProvider<CompanyListNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyListNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
