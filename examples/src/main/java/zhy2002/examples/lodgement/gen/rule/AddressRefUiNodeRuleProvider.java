package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.AddressRefUiNode;


@AddressRefUiNodeScope
public class AddressRefUiNodeRuleProvider
    extends ObjectUiNodeRuleProvider<AddressRefUiNode> {

    @Inject
    public AddressRefUiNodeRuleProvider() {}

    @Override
    public void initializeState(AddressRefUiNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
