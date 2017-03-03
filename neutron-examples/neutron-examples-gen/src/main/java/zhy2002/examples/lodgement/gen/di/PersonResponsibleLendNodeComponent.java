package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonResponsibleLendNodeScope
@Subcomponent(modules = {PersonResponsibleLendNodeModule.class})
public interface PersonResponsibleLendNodeComponent {

    PersonResponsibleLendNodeRuleProvider getPersonResponsibleLendNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonResponsibleLendNodeModule(PersonResponsibleLendNodeModule module);

        PersonResponsibleLendNodeComponent build();
    }
}
