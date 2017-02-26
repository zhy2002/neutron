package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.AdditionalNode;


@AdditionalNodeScope
public class AdditionalNodeRuleProvider
    extends ObjectUiNodeRuleProvider<AdditionalNode> {

    @Inject
    public AdditionalNodeRuleProvider() {}

    @Override
    public void initializeState(AdditionalNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}