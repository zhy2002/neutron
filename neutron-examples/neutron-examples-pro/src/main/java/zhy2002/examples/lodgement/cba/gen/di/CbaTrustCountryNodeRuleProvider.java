package zhy2002.examples.lodgement.cba.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@TrustCountryNodeScope
public class CbaTrustCountryNodeRuleProvider extends TrustCountryNodeRuleProvider {

    @Inject
    public CbaTrustCountryNodeRuleProvider() {
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
