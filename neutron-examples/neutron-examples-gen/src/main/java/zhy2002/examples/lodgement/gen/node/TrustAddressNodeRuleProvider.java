package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

@TrustAddressNodeScope
public class TrustAddressNodeRuleProvider implements RuleProvider<TrustAddressNode> {

    @Inject
    AddressNodeRuleProvider parentRuleProvider;

    @Inject
    public TrustAddressNodeRuleProvider() {
    }

    @Override
    public void initializeState(TrustAddressNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
    }

}
