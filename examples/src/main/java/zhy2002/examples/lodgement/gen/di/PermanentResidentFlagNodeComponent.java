package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

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
