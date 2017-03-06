package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@TitleNodeScope
@Subcomponent(modules = {TitleNodeModule.class})
public interface TitleNodeComponent {

    TitleNodeRuleProvider getTitleNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setTitleNodeModule(TitleNodeModule module);

        TitleNodeComponent build();
    }
}
