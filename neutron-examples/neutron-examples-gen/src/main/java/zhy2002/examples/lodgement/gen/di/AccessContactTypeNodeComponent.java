package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@AccessContactTypeNodeScope
@Subcomponent(modules = {AccessContactTypeNodeModule.class})
public interface AccessContactTypeNodeComponent {

    AccessContactTypeNodeRuleProvider getAccessContactTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAccessContactTypeNodeModule(AccessContactTypeNodeModule module);

        AccessContactTypeNodeComponent build();
    }
}
