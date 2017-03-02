package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.AddressRefListNode;


@AddressRefListNodeScope
public class AddressRefListNodeRuleProvider
    extends ListUiNodeRuleProvider<AddressRefListNode> {

    @Inject
    public AddressRefListNodeRuleProvider() {}

    @Override
    public void initializeState(AddressRefListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
