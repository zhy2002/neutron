package zhy2002.examples.lodgement.nab.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@OtherLiabilityTypeNodeScope
public class NabOtherLiabilityTypeNodeRuleProvider extends OtherLiabilityTypeNodeRuleProvider {

    @Inject
    public NabOtherLiabilityTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherLiabilityTypeNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.OTHER_LIABILITY_TYPE);
        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
