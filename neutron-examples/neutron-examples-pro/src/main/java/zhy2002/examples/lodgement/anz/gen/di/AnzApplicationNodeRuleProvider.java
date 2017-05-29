package zhy2002.examples.lodgement.anz.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ApplicationNodeScope
public class AnzApplicationNodeRuleProvider extends ApplicationNodeRuleProvider {

    @Inject
    public AnzApplicationNodeRuleProvider() {
    }

    @Override
    public void initializeState(ApplicationNode node) {
        super.initializeState(node);

        node.setNodeLabel("ANZ");
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
