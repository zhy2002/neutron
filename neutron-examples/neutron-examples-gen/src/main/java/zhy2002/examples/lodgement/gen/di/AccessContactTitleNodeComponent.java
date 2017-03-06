package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@AccessContactTitleNodeScope
@Subcomponent(modules = {AccessContactTitleNodeModule.class})
public interface AccessContactTitleNodeComponent {

    AccessContactTitleNodeRuleProvider getAccessContactTitleNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAccessContactTitleNodeModule(AccessContactTitleNodeModule module);

        AccessContactTitleNodeComponent build();
    }
}
