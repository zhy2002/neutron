package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@RetiredSinceNodeScope
@Subcomponent(modules = {RetiredSinceNodeModule.class})
public interface RetiredSinceNodeComponent {

    RetiredSinceNodeRuleProvider getRetiredSinceNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setRetiredSinceNodeModule(RetiredSinceNodeModule module);

        RetiredSinceNodeComponent build();
    }
}
