package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.HousingStatusNode;


@HousingStatusNodeScope
public class HousingStatusNodeRuleProvider
    extends StringUiNodeRuleProvider<HousingStatusNode> {

    @Inject
    public HousingStatusNodeRuleProvider() {}

    @Override
    public void initializeState(HousingStatusNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
