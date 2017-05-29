package zhy2002.examples.lodgement.anz.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@CurrentEmploymentNodeScope
public class AnzCurrentEmploymentNodeRuleProvider extends CurrentEmploymentNodeRuleProvider {

    @Inject
    public AnzCurrentEmploymentNodeRuleProvider() {
    }

    @Override
    public void initializeState(CurrentEmploymentNode node) {
        super.initializeState(node);

        node.setNodeLabel("Employment");
        node.setCurrentRecord(Boolean.TRUE);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
