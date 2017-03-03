package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.OtherAssetTypeNode;


@OtherAssetTypeNodeScope
public class OtherAssetTypeNodeRuleProvider
    extends StringUiNodeRuleProvider<OtherAssetTypeNode> {

    @Inject
    public OtherAssetTypeNodeRuleProvider() {}

    @Override
    public void initializeState(OtherAssetTypeNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
