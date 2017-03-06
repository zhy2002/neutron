package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@PermanentResidentFlagNodeScope
@Subcomponent(modules = {PermanentResidentFlagNodeModule.class})
public interface PermanentResidentFlagNodeComponent {

    PermanentResidentFlagNodeRuleProvider getPermanentResidentFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPermanentResidentFlagNodeModule(PermanentResidentFlagNodeModule module);

        PermanentResidentFlagNodeComponent build();
    }
}
