package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CompanyResponsibleLendNode;


@CompanyResponsibleLendNodeScope
public class CompanyResponsibleLendNodeRuleProvider
    extends BaseResponsibleLendNodeRuleProvider<CompanyResponsibleLendNode> {

    @Inject
    public CompanyResponsibleLendNodeRuleProvider() {}

    @Override
    public void initializeState(CompanyResponsibleLendNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
