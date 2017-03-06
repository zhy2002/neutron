package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@DateOfBirthNodeScope
@Subcomponent(modules = {DateOfBirthNodeModule.class})
public interface DateOfBirthNodeComponent {

    DateOfBirthNodeRuleProvider getDateOfBirthNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setDateOfBirthNodeModule(DateOfBirthNodeModule module);

        DateOfBirthNodeComponent build();
    }
}
