package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PostcodeNodeScope
@Subcomponent(modules = {PostcodeNodeModule.class})
public interface PostcodeNodeComponent {

    PostcodeNodeRuleProvider getPostcodeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPostcodeNodeModule(PostcodeNodeModule module);

        PostcodeNodeComponent build();
    }
}
