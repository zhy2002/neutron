package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ResponsibleMitigationMethodNodeScope
public class WestpacResponsibleMitigationMethodNodeRuleProvider extends ResponsibleMitigationMethodNodeRuleProvider {

    @Inject
    public WestpacResponsibleMitigationMethodNodeRuleProvider() {
    }

    @Override
    public void initializeState(ResponsibleMitigationMethodNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.RESPONSIBLE_MITIGATION_TYPE);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
