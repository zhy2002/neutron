package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

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
