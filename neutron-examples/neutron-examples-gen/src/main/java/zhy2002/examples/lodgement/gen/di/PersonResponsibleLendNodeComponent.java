package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {PersonResponsibleLendNodeModule.class})
public interface PersonResponsibleLendNodeComponent extends BaseResponsibleLendNodeComponent {

    List<RuleProvider<PersonResponsibleLendNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setPersonResponsibleLendNodeModule(PersonResponsibleLendNodeModule module);

        PersonResponsibleLendNodeComponent build();
    }

}
