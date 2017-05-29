package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ThirdPartyTitleNodeScope
public class WestpacThirdPartyTitleNodeRuleProvider extends ThirdPartyTitleNodeRuleProvider {

    @Inject
    public WestpacThirdPartyTitleNodeRuleProvider() {
    }

    @Override
    public void initializeState(ThirdPartyTitleNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.TITLE_TYPE);
        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
