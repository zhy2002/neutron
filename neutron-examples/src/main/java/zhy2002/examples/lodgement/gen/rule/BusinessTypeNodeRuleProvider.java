package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.BusinessTypeNode;


@BusinessTypeNodeScope
public class BusinessTypeNodeRuleProvider
    extends StringUiNodeRuleProvider<BusinessTypeNode> {

    @Inject
    public BusinessTypeNodeRuleProvider() {}

    @Override
    public void initializeState(BusinessTypeNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
