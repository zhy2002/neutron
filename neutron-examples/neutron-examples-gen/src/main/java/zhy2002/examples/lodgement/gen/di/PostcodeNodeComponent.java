package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PostcodeNodeScope
@Subcomponent(modules = {PostcodeNodeModule.class})
public interface PostcodeNodeComponent {

    PostcodeNodeRuleProvider getPostcodeNodeRuleProvider();
    Map<String, RuleProvider<PostcodeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPostcodeNodeModule(PostcodeNodeModule module);

        PostcodeNodeComponent build();
    }
}
