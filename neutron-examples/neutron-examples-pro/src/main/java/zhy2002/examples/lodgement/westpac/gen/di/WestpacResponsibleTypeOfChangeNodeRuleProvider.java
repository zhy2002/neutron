package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ResponsibleTypeOfChangeNodeScope
public class WestpacResponsibleTypeOfChangeNodeRuleProvider extends ResponsibleTypeOfChangeNodeRuleProvider {

    @Inject
    public WestpacResponsibleTypeOfChangeNodeRuleProvider() {
    }

    @Override
    public void initializeState(ResponsibleTypeOfChangeNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.RESPONSIBLE_CHANGE_TYPE);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
