package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CompanyAcnNode;


@CompanyAcnNodeScope
public class CompanyAcnNodeRuleProvider
    extends StringUiNodeRuleProvider<CompanyAcnNode> {

    @Inject
    public CompanyAcnNodeRuleProvider() {}

    @Override
    public void initializeState(CompanyAcnNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
