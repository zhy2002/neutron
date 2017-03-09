package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

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
