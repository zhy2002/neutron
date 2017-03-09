package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

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