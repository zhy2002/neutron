package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CompanyDescriptionNode;


@CompanyDescriptionNodeScope
public class CompanyDescriptionNodeRuleProvider
    extends StringUiNodeRuleProvider<CompanyDescriptionNode> {

    @Inject
    public CompanyDescriptionNodeRuleProvider() {}

    @Override
    public void initializeState(CompanyDescriptionNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
