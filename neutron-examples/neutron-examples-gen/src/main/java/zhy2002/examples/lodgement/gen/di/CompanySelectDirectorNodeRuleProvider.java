package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CompanySelectDirectorNode;
import zhy2002.examples.lodgement.gen.di.*;

@CompanySelectDirectorNodeScope
public class CompanySelectDirectorNodeRuleProvider implements RuleProvider<CompanySelectDirectorNode> {

    @Inject
    SelectRelatedPersonListNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanySelectDirectorNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanySelectDirectorNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
