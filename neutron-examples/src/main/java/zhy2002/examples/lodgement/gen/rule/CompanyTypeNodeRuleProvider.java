package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CompanyTypeNode;


@CompanyTypeNodeScope
public class CompanyTypeNodeRuleProvider
    extends StringUiNodeRuleProvider<CompanyTypeNode> {

    @Inject
    public CompanyTypeNodeRuleProvider() {}

    @Override
    public void initializeState(CompanyTypeNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
