package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@MobileNumberNodeScope
@Subcomponent(modules = {MobileNumberNodeModule.class})
public interface MobileNumberNodeComponent {

    MobileNumberNodeRuleProvider getMobileNumberNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMobileNumberNodeModule(MobileNumberNodeModule module);

        MobileNumberNodeComponent build();
    }
}
