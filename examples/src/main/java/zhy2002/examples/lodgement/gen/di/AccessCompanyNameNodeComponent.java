package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

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
