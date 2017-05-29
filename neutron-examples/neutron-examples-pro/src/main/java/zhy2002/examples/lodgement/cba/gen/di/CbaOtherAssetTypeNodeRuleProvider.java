package zhy2002.examples.lodgement.cba.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@OtherAssetTypeNodeScope
public class CbaOtherAssetTypeNodeRuleProvider extends OtherAssetTypeNodeRuleProvider {

    @Inject
    public CbaOtherAssetTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherAssetTypeNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.OTHER_ASSET_TYPE);
        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
