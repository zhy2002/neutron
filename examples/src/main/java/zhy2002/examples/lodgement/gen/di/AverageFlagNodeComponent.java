package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@AverageFlagNodeScope
@Subcomponent(modules = {AverageFlagNodeModule.class})
public interface AverageFlagNodeComponent {

    AverageFlagNodeRuleProvider getAverageFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAverageFlagNodeModule(AverageFlagNodeModule module);

        AverageFlagNodeComponent build();
    }
}
