package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.AddressListNode;


@AddressListNodeScope
public class AddressListNodeRuleProvider
    extends ListUiNodeRuleProvider<AddressListNode> {

    @Inject
    public AddressListNodeRuleProvider() {}

    @Override
    public void initializeState(AddressListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
