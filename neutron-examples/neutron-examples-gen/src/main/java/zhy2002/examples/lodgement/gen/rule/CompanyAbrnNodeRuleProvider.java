package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CompanyAbrnNode;


@CompanyAbrnNodeScope
public class CompanyAbrnNodeRuleProvider
    extends StringUiNodeRuleProvider<CompanyAbrnNode> {

    @Inject
    public CompanyAbrnNodeRuleProvider() {}

    @Override
    public void initializeState(CompanyAbrnNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
