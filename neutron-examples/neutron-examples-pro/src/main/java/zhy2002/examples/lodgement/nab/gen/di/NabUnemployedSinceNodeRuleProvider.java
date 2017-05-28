package zhy2002.examples.lodgement.nab.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@UnemployedSinceNodeScope
public class NabUnemployedSinceNodeRuleProvider extends UnemployedSinceNodeRuleProvider {

    @Inject
    public NabUnemployedSinceNodeRuleProvider() {
    }

    @Override
    public void initializeState(UnemployedSinceNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
