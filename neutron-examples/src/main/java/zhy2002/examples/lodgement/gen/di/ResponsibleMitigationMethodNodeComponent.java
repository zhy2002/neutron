package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ResponsibleMitigationMethodNodeScope
@Subcomponent(modules = {ResponsibleMitigationMethodNodeModule.class})
public interface ResponsibleMitigationMethodNodeComponent {

    ResponsibleMitigationMethodNodeRuleProvider getResponsibleMitigationMethodNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setResponsibleMitigationMethodNodeModule(ResponsibleMitigationMethodNodeModule module);

        ResponsibleMitigationMethodNodeComponent build();
    }
}
