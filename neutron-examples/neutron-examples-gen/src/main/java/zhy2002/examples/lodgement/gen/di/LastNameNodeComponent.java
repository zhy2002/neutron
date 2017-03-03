package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@LastNameNodeScope
@Subcomponent(modules = {LastNameNodeModule.class})
public interface LastNameNodeComponent {

    LastNameNodeRuleProvider getLastNameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setLastNameNodeModule(LastNameNodeModule module);

        LastNameNodeComponent build();
    }
}
