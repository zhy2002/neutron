package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@PostcodeNodeScope
public class PostcodeNodeRuleProvider implements RuleProvider<PostcodeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PostcodeNodeRuleProvider() {
    }

    @Override
    public void initializeState(PostcodeNode node) {
        parentRuleProvider.initializeState(node);

        node.setRequired(true);
        node.setPattern("\\d{4,4}");
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
    }

}
