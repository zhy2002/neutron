package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CompanyEmailNode;


@CompanyEmailNodeScope
public class CompanyEmailNodeRuleProvider
    extends EmailNodeRuleProvider<CompanyEmailNode> {

    @Inject
    public CompanyEmailNodeRuleProvider() {}

    @Override
    public void initializeState(CompanyEmailNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
