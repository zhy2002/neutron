package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonPrivacyNodeScope
@Subcomponent(modules = {PersonPrivacyNodeModule.class})
public interface PersonPrivacyNodeComponent {

    PersonPrivacyNodeRuleProvider getPersonPrivacyNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonPrivacyNodeModule(PersonPrivacyNodeModule module);

        PersonPrivacyNodeComponent build();
    }
}
