package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.OtherIncomePreviousYearNode;


@OtherIncomePreviousYearNodeScope
public class OtherIncomePreviousYearNodeRuleProvider
    extends BooleanUiNodeRuleProvider<OtherIncomePreviousYearNode> {

    @Inject
    public OtherIncomePreviousYearNodeRuleProvider() {}

    @Override
    public void initializeState(OtherIncomePreviousYearNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
