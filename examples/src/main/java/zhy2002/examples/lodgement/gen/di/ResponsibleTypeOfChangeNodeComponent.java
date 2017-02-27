package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ResponsibleTypeOfChangeNodeScope
@Subcomponent(modules = {ResponsibleTypeOfChangeNodeModule.class})
public interface ResponsibleTypeOfChangeNodeComponent {

    ResponsibleTypeOfChangeNodeRuleProvider getResponsibleTypeOfChangeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setResponsibleTypeOfChangeNodeModule(ResponsibleTypeOfChangeNodeModule module);

        ResponsibleTypeOfChangeNodeComponent build();
    }
}
