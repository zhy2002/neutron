package zhy2002.examples.lodgement.cba.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ApplicationNodeScope
public class CbaApplicationNodeRuleProvider extends ApplicationNodeRuleProvider {

    @Inject
    public CbaApplicationNodeRuleProvider() {
    }

    @Override
    public void initializeState(ApplicationNode node) {
        super.initializeState(node);

        node.setNodeLabel("CBA");
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
