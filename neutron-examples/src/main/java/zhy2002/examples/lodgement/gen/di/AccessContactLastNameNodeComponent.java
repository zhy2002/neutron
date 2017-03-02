package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@AccessContactLastNameNodeScope
@Subcomponent(modules = {AccessContactLastNameNodeModule.class})
public interface AccessContactLastNameNodeComponent {

    AccessContactLastNameNodeRuleProvider getAccessContactLastNameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAccessContactLastNameNodeModule(AccessContactLastNameNodeModule module);

        AccessContactLastNameNodeComponent build();
    }
}
