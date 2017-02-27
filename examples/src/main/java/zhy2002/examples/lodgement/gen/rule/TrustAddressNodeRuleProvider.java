package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.TrustAddressNode;


@TrustAddressNodeScope
public class TrustAddressNodeRuleProvider
    extends AddressNodeRuleProvider<TrustAddressNode> {

    @Inject
    public TrustAddressNodeRuleProvider() {}

    @Override
    public void initializeState(TrustAddressNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
