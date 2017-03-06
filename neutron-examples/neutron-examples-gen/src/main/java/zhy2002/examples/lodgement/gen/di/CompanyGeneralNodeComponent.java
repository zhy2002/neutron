package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CompanyGeneralNodeScope
@Subcomponent(modules = {CompanyGeneralNodeModule.class})
public interface CompanyGeneralNodeComponent {

    CompanyGeneralNodeRuleProvider getCompanyGeneralNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyGeneralNodeModule(CompanyGeneralNodeModule module);

        CompanyGeneralNodeComponent build();
    }
}
