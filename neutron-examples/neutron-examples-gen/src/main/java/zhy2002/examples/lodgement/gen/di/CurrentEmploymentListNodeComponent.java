package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CurrentEmploymentListNodeScope
@Subcomponent(modules = {CurrentEmploymentListNodeModule.class})
public interface CurrentEmploymentListNodeComponent {

    CurrentEmploymentListNodeRuleProvider getCurrentEmploymentListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCurrentEmploymentListNodeModule(CurrentEmploymentListNodeModule module);

        CurrentEmploymentListNodeComponent build();
    }
}
