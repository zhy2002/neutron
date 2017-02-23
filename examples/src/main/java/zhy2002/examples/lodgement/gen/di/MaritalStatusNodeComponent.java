package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@MaritalStatusNodeScope
@Subcomponent(modules = {MaritalStatusNodeModule.class})
public interface MaritalStatusNodeComponent {

    MaritalStatusNodeRuleProvider getMaritalStatusNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMaritalStatusNodeModule(MaritalStatusNodeModule module);

        MaritalStatusNodeComponent build();
    }
}
