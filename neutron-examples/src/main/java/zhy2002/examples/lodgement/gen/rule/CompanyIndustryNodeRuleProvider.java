package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CompanyIndustryNode;


@CompanyIndustryNodeScope
public class CompanyIndustryNodeRuleProvider
    extends StringUiNodeRuleProvider<CompanyIndustryNode> {

    @Inject
    public CompanyIndustryNodeRuleProvider() {}

    @Override
    public void initializeState(CompanyIndustryNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
