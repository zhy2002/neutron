package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CompanyContactNode;


@CompanyContactNodeScope
public class CompanyContactNodeRuleProvider
    extends BaseContactNodeRuleProvider<CompanyContactNode> {

    @Inject
    public CompanyContactNodeRuleProvider() {}

    @Override
    public void initializeState(CompanyContactNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
