package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PostcodeNode;


@PostcodeNodeScope
public class PostcodeNodeRuleProvider
    extends StringUiNodeRuleProvider<PostcodeNode> {

    @Inject
    public PostcodeNodeRuleProvider() {}

    @Override
    public void initializeState(PostcodeNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
