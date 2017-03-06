package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@PersonApplicantTypeNodeScope
@Subcomponent(modules = {PersonApplicantTypeNodeModule.class})
public interface PersonApplicantTypeNodeComponent {

    PersonApplicantTypeNodeRuleProvider getPersonApplicantTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonApplicantTypeNodeModule(PersonApplicantTypeNodeModule module);

        PersonApplicantTypeNodeComponent build();
    }
}
