package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@AccessContactFirstNameNodeScope
@Subcomponent(modules = {AccessContactFirstNameNodeModule.class})
public interface AccessContactFirstNameNodeComponent {

    AccessContactFirstNameNodeRuleProvider getAccessContactFirstNameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAccessContactFirstNameNodeModule(AccessContactFirstNameNodeModule module);

        AccessContactFirstNameNodeComponent build();
    }
}
