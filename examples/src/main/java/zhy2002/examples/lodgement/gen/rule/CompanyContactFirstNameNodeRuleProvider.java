package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CompanyContactFirstNameNode;


@CompanyContactFirstNameNodeScope
public class CompanyContactFirstNameNodeRuleProvider
    extends StringUiNodeRuleProvider<CompanyContactFirstNameNode> {

    @Inject
    public CompanyContactFirstNameNodeRuleProvider() {}

    @Override
    public void initializeState(CompanyContactFirstNameNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
