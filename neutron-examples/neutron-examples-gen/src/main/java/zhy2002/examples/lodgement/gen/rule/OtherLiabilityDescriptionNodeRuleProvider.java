package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityDescriptionNode;


@OtherLiabilityDescriptionNodeScope
public class OtherLiabilityDescriptionNodeRuleProvider
    extends StringUiNodeRuleProvider<OtherLiabilityDescriptionNode> {

    @Inject
    public OtherLiabilityDescriptionNodeRuleProvider() {}

    @Override
    public void initializeState(OtherLiabilityDescriptionNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
