package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {PostcodeNodeModule.class})
public interface PostcodeNodeComponent {

    List<RuleProvider<PostcodeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setPostcodeNodeModule(PostcodeNodeModule module);

        PostcodeNodeComponent build();
    }

}
