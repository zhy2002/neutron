package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.rule.*;

@AreaCodeNodeScope
@Subcomponent(modules = {AreaCodeNodeModule.class})
public interface AreaCodeNodeComponent {

    AreaCodeNodeRuleProvider getAreaCodeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAreaCodeNodeModule(AreaCodeNodeModule module);

        AreaCodeNodeComponent build();
    }
}
