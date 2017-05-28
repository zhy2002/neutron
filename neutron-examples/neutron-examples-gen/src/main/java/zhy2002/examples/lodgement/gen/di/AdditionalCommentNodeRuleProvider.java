package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.AdditionalCommentNode;
import zhy2002.examples.lodgement.gen.di.*;

@AdditionalCommentNodeScope
public class AdditionalCommentNodeRuleProvider implements RuleProvider<AdditionalCommentNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public AdditionalCommentNodeRuleProvider() {
    }

    @Override
    public void initializeState(AdditionalCommentNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
