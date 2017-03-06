package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@AccessNodeScope
@Subcomponent(modules = {AccessNodeModule.class})
public interface AccessNodeComponent {

    AccessNodeRuleProvider getAccessNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAccessNodeModule(AccessNodeModule module);

        AccessNodeComponent build();
    }
}
