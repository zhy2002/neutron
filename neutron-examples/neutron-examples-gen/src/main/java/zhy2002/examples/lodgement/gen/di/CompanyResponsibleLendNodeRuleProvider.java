package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CompanyResponsibleLendNode;
import zhy2002.examples.lodgement.gen.di.*;

@CompanyResponsibleLendNodeScope
public class CompanyResponsibleLendNodeRuleProvider implements RuleProvider<CompanyResponsibleLendNode> {

    @Inject
    BaseResponsibleLendNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyResponsibleLendNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyResponsibleLendNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
