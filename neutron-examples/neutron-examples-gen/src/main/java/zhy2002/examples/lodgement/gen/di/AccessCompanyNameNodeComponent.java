package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@AccessCompanyNameNodeScope
@Subcomponent(modules = {AccessCompanyNameNodeModule.class})
public interface AccessCompanyNameNodeComponent {

    AccessCompanyNameNodeRuleProvider getAccessCompanyNameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAccessCompanyNameNodeModule(AccessCompanyNameNodeModule module);

        AccessCompanyNameNodeComponent build();
    }
}
