package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@PropertyPurseNodeScope
public class WestpacPropertyPurseNodeRuleProvider extends PropertyPurseNodeRuleProvider {

    @Inject
    public WestpacPropertyPurseNodeRuleProvider() {
    }

    @Override
    public void initializeState(PropertyPurseNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
