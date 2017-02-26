package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.PropertyAddressNode;


@PropertyAddressNodeScope
public class PropertyAddressNodeRuleProvider
    extends StringUiNodeRuleProvider<PropertyAddressNode> {

    @Inject
    public PropertyAddressNodeRuleProvider() {}

    @Override
    public void initializeState(PropertyAddressNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}