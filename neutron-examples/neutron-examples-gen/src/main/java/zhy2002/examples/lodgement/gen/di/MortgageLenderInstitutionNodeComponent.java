package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@MortgageLenderInstitutionNodeScope
@Subcomponent(modules = {MortgageLenderInstitutionNodeModule.class})
public interface MortgageLenderInstitutionNodeComponent {

    MortgageLenderInstitutionNodeRuleProvider getMortgageLenderInstitutionNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageLenderInstitutionNodeModule(MortgageLenderInstitutionNodeModule module);

        MortgageLenderInstitutionNodeComponent build();
    }
}
