package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PersonResponsibleLendNodeScope
@Subcomponent(modules = {PersonResponsibleLendNodeModule.class})
public interface PersonResponsibleLendNodeComponent {

    PersonResponsibleLendNodeRuleProvider getPersonResponsibleLendNodeRuleProvider();
    Map<String, RuleProvider<PersonResponsibleLendNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonResponsibleLendNodeModule(PersonResponsibleLendNodeModule module);

        PersonResponsibleLendNodeComponent build();
    }
}
