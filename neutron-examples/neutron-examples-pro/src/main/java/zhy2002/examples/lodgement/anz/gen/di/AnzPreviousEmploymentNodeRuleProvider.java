package zhy2002.examples.lodgement.anz.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@PreviousEmploymentNodeScope
public class AnzPreviousEmploymentNodeRuleProvider extends PreviousEmploymentNodeRuleProvider {

    @Inject
    public AnzPreviousEmploymentNodeRuleProvider() {
    }

    @Override
    public void initializeState(PreviousEmploymentNode node) {
        super.initializeState(node);

        node.setNodeLabel("Employment");
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
