package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@GenderNodeScope
@Subcomponent(modules = {GenderNodeModule.class})
public interface GenderNodeComponent {

    GenderNodeRuleProvider getGenderNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setGenderNodeModule(GenderNodeModule module);

        GenderNodeComponent build();
    }
}
