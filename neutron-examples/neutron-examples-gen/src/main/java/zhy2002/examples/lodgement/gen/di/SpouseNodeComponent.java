package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@SpouseNodeScope
@Subcomponent(modules = {SpouseNodeModule.class})
public interface SpouseNodeComponent {

    SpouseNodeRuleProvider getSpouseNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSpouseNodeModule(SpouseNodeModule module);

        SpouseNodeComponent build();
    }
}
