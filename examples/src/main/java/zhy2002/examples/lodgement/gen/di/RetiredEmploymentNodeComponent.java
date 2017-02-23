package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@RetiredEmploymentNodeScope
@Subcomponent(modules = {RetiredEmploymentNodeModule.class})
public interface RetiredEmploymentNodeComponent {

    RetiredEmploymentNodeRuleProvider getRetiredEmploymentNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setRetiredEmploymentNodeModule(RetiredEmploymentNodeModule module);

        RetiredEmploymentNodeComponent build();
    }
}
