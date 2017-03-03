package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PropertySubTypeNode;


@PropertySubTypeNodeScope
public class PropertySubTypeNodeRuleProvider
    extends StringUiNodeRuleProvider<PropertySubTypeNode> {

    @Inject
    public PropertySubTypeNodeRuleProvider() {}

    @Override
    public void initializeState(PropertySubTypeNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
