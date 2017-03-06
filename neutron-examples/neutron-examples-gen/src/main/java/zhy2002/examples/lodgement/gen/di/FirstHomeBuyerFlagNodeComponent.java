package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@FirstHomeBuyerFlagNodeScope
@Subcomponent(modules = {FirstHomeBuyerFlagNodeModule.class})
public interface FirstHomeBuyerFlagNodeComponent {

    FirstHomeBuyerFlagNodeRuleProvider getFirstHomeBuyerFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setFirstHomeBuyerFlagNodeModule(FirstHomeBuyerFlagNodeModule module);

        FirstHomeBuyerFlagNodeComponent build();
    }
}
