package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {PersonApplicantTypeNodeModule.class})
public interface PersonApplicantTypeNodeComponent {


    RuleProvider<PersonApplicantTypeNode> getPersonApplicantTypeNodeRuleProvider();
    Map<String, RuleProvider<PersonApplicantTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonApplicantTypeNodeModule(PersonApplicantTypeNodeModule module);

        PersonApplicantTypeNodeComponent build();
    }

}
