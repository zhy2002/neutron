package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;

@CompanyEmailNodeScope
public class CompanyEmailNodeRuleProvider implements RuleProvider<CompanyEmailNode> {

    @Inject
    EmailNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyEmailNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyEmailNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
