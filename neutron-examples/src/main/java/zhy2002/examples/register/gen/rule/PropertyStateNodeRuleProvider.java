package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.PropertyStateNode;


@PropertyStateNodeScope
public class PropertyStateNodeRuleProvider
    extends StringUiNodeRuleProvider<PropertyStateNode> {

    @Inject
    public PropertyStateNodeRuleProvider() {}

    @Override
    public void initializeState(PropertyStateNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
