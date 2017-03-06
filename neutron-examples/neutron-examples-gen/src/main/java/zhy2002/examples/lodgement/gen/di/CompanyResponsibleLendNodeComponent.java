package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CompanyResponsibleLendNodeScope
@Subcomponent(modules = {CompanyResponsibleLendNodeModule.class})
public interface CompanyResponsibleLendNodeComponent {

    CompanyResponsibleLendNodeRuleProvider getCompanyResponsibleLendNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyResponsibleLendNodeModule(CompanyResponsibleLendNodeModule module);

        CompanyResponsibleLendNodeComponent build();
    }
}
