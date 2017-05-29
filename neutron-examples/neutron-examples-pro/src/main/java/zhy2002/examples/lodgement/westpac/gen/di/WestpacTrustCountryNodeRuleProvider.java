package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@TrustCountryNodeScope
public class WestpacTrustCountryNodeRuleProvider extends TrustCountryNodeRuleProvider {

    @Inject
    public WestpacTrustCountryNodeRuleProvider() {
    }

    @Override
    public void initializeState(TrustCountryNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
