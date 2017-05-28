package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.AddressRefListNode;
import zhy2002.examples.lodgement.gen.di.*;

@AddressRefListNodeScope
public class AddressRefListNodeRuleProvider implements RuleProvider<AddressRefListNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public AddressRefListNodeRuleProvider() {
    }

    @Override
    public void initializeState(AddressRefListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
