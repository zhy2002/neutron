package zhy2002.examples.lodgement.cba.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.cba.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@TrustTypeNodeScope
public class CbaTrustTypeNodeRuleProvider extends TrustTypeNodeRuleProvider {

    @Inject
    public CbaTrustTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(TrustTypeNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.TRUST_TYPE);
    }

    @Inject
    Provider<TrustTypeChangedRule> trustTypeChangedRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        TrustTypeChangedRule trustTypeChangedRule = trustTypeChangedRuleProvider.get();
        createdRules.add(trustTypeChangedRule);
    }

}
