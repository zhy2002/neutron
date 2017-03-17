package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@AccessTelephoneNodeScope
public class AccessTelephoneNodeRuleProvider implements RuleProvider<AccessTelephoneNode> {

    @Inject
    TelephoneNodeRuleProvider parentRuleProvider;

    @Inject
    public AccessTelephoneNodeRuleProvider() {
    }

    @Override
    public void initializeState(AccessTelephoneNode node) {
        parentRuleProvider.initializeState(node);

        node.setCountryCodeReadonly(Boolean.TRUE);
        node.setValue(ApplicationNodeConstants.AUS_DEFAULT);
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
