package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.MaritalStatusNode;


@MaritalStatusNodeScope
public class MaritalStatusNodeRuleProvider
    extends StringUiNodeRuleProvider<MaritalStatusNode> {

    @Inject
    public MaritalStatusNodeRuleProvider() {}

    @Override
    public void initializeState(MaritalStatusNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
