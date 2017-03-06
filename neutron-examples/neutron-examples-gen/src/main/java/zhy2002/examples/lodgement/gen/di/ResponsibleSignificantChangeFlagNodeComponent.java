package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ResponsibleSignificantChangeFlagNodeScope
@Subcomponent(modules = {ResponsibleSignificantChangeFlagNodeModule.class})
public interface ResponsibleSignificantChangeFlagNodeComponent {

    ResponsibleSignificantChangeFlagNodeRuleProvider getResponsibleSignificantChangeFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setResponsibleSignificantChangeFlagNodeModule(ResponsibleSignificantChangeFlagNodeModule module);

        ResponsibleSignificantChangeFlagNodeComponent build();
    }
}
