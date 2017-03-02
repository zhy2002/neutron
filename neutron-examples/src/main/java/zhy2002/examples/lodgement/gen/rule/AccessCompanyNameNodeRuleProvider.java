package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.AccessCompanyNameNode;


@AccessCompanyNameNodeScope
public class AccessCompanyNameNodeRuleProvider
    extends StringUiNodeRuleProvider<AccessCompanyNameNode> {

    @Inject
    public AccessCompanyNameNodeRuleProvider() {}

    @Override
    public void initializeState(AccessCompanyNameNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
