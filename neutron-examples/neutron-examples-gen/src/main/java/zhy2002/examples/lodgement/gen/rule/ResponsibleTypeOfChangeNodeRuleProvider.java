package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ResponsibleTypeOfChangeNode;


@ResponsibleTypeOfChangeNodeScope
public class ResponsibleTypeOfChangeNodeRuleProvider
    extends StringUiNodeRuleProvider<ResponsibleTypeOfChangeNode> {

    @Inject
    public ResponsibleTypeOfChangeNodeRuleProvider() {}

    @Override
    public void initializeState(ResponsibleTypeOfChangeNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
