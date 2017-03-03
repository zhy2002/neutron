package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.AddressRefNode;


@AddressRefNodeScope
public class AddressRefNodeRuleProvider
    extends ReferenceUiNodeRuleProvider<AddressRefNode> {

    @Inject
    public AddressRefNodeRuleProvider() {}

    @Override
    public void initializeState(AddressRefNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
