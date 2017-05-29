package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@AccessContactTitleNodeScope
public class WestpacAccessContactTitleNodeRuleProvider extends AccessContactTitleNodeRuleProvider {

    @Inject
    public WestpacAccessContactTitleNodeRuleProvider() {
    }

    @Override
    public void initializeState(AccessContactTitleNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.TITLE_TYPE);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
