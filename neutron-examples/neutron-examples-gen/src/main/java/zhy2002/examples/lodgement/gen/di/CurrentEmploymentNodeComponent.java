package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CurrentEmploymentNodeScope
@Subcomponent(modules = {CurrentEmploymentNodeModule.class})
public interface CurrentEmploymentNodeComponent {

    CurrentEmploymentNodeRuleProvider getCurrentEmploymentNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCurrentEmploymentNodeModule(CurrentEmploymentNodeModule module);

        CurrentEmploymentNodeComponent build();
    }
}
